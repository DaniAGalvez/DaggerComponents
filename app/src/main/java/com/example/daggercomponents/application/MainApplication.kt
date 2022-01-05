package com.example.daggercomponents.application

import android.app.Application
import com.example.daggercomponents.dagger.DaggerMainComponent
import com.example.daggercomponents.dagger.MainComponent
import com.example.resources_impl.dagger.ResourcesComponentProvider
import com.example.resources_impl.dagger.component.DaggerResourcesComponent
import com.example.resources_impl.dagger.component.ResourcesComponent

class MainApplication : Application(), ResourcesComponentProvider {

    lateinit var mainComponent: MainComponent
    lateinit var resourcesComponent: ResourcesComponent

    init {
        appInstance = this
    }

    override fun onCreate() {
        super.onCreate()
        initializeComponent()
    }

    private fun initializeComponent() {
        if (this::mainComponent.isInitialized.not()) {
            val component = DaggerMainComponent.builder()
                .application(this)
                .build()
                .apply {
                    inject(this@MainApplication)
                }
            this.mainComponent = component
        }

    }

    override fun provideResourcesComponent(): ResourcesComponent {
        if (this::resourcesComponent.isInitialized.not()) {
            val component = DaggerResourcesComponent
                .builder()
                .parent(mainComponent)
                .build()
            this.resourcesComponent = component
        }
        return resourcesComponent
    }

    companion object {
        private var appInstance: MainApplication? = null
        fun getInstance(): MainApplication {
            return appInstance as MainApplication
        }
    }

}