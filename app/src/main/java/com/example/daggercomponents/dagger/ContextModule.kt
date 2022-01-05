package com.example.daggercomponents.dagger

import android.app.Application
import android.content.Context
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
internal abstract class ContextModule {

    @Singleton
    @Binds
    abstract fun context(appInstance: Application): Context
}