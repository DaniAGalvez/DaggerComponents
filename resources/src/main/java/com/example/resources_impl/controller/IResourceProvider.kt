package com.example.resources_impl.controller

import androidx.annotation.StringRes


interface IResourceProvider {

    fun getString(@StringRes resourceId: Int): String
}