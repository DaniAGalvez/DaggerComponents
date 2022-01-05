package com.example.profile.dagger

import com.example.profile.ResourceActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilder {

    @ContributesAndroidInjector
    abstract fun contributesResourceActivityInjector(): ResourceActivity
}