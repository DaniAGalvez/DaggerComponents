package com.example.resources_impl.dagger.component


import android.content.Context
import com.example.resources_impl.controller.IResourceProvider
import com.example.resources_impl.dagger.ResourcesModule
import dagger.Component

@Component(
    modules = [ResourcesModule::class],
    dependencies = [ResourcesComponent.Parent::class]
)
interface ResourcesComponent {

    val resourcesProvider: IResourceProvider

    interface Parent {
        fun context(): Context
    }

}