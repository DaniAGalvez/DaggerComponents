package com.example.profile.dagger

import com.example.resources_impl.dagger.component.ResourcesComponent
import dagger.Component
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule

@Component(
    dependencies = [ResourcesComponent::class],
    modules = [AndroidSupportInjectionModule::class,
        ActivityBuilder::class]
)
interface ProfileFeatureComponent {
    fun androidInjector(): DispatchingAndroidInjector<Any>

    @Component.Factory
    interface Factory {
        fun create(resourcesComponent: ResourcesComponent): ProfileFeatureComponent
    }
}