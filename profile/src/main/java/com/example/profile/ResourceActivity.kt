package com.example.profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.profile.dagger.CustomInjector
import com.example.profile.databinding.ActivityResourceBinding
import com.example.resources_impl.controller.IResourceProvider
import javax.inject.Inject

class ResourceActivity : AppCompatActivity() {

    @Inject
    lateinit var iResourceProvider: IResourceProvider

    lateinit var binding: ActivityResourceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        CustomInjector.inject(this, applicationContext)
        super.onCreate(savedInstanceState)
        binding = ActivityResourceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textViewExample.text = iResourceProvider.getString(R.string.provided_string)

    }
}