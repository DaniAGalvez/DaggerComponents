package com.example.resources_impl.controller.impl

import android.content.Context
import com.example.resources_impl.controller.IResourceProvider
import javax.inject.Inject


internal class ResourcesProviderImpl @Inject constructor(private val context: Context) :
    IResourceProvider {

    override fun getString(resourceId: Int): String {
        return context.getString(resourceId)
    }
}