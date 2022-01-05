package com.example.resources_impl.dagger

import com.example.resources_impl.dagger.component.ResourcesComponent

interface ResourcesComponentProvider {
    fun provideResourcesComponent(): ResourcesComponent
}