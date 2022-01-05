package com.example.daggercomponents.dagger

import android.app.Application
import android.content.Context
import com.example.resources_impl.dagger.component.ResourcesComponent
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class])
interface MainComponent : ResourcesComponent.Parent {

    fun inject(application: Application)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): MainComponent
    }
}