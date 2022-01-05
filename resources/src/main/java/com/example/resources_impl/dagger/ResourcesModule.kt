package com.example.resources_impl.dagger

import com.example.resources_impl.controller.IResourceProvider
import com.example.resources_impl.controller.impl.ResourcesProviderImpl
import dagger.Binds
import dagger.Module

@Module
internal abstract class ResourcesModule {

    @Binds
    abstract fun bindResourceProvider(resourcesProviderImpl: ResourcesProviderImpl): IResourceProvider

}