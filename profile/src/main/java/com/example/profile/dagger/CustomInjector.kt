package com.example.profile.dagger

import android.content.Context
import com.example.resources_impl.dagger.ResourcesComponentProvider

object CustomInjector {

    lateinit var currentComponent: ProfileFeatureComponent

    fun inject(clazz: Any, appContext: Context) {
        getProfileFeatureComponent(appContext)
            .androidInjector()
            .inject(clazz)
    }

    private fun getProfileFeatureComponent(appContext: Context): ProfileFeatureComponent {
        if (this::currentComponent.isInitialized.not()) {
            currentComponent = DaggerProfileFeatureComponent.factory()
                .create((appContext as ResourcesComponentProvider).provideResourcesComponent())
        }
        return currentComponent
    }
}