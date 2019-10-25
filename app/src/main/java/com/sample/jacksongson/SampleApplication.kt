package com.sample.jacksongson

import android.app.Application

class SampleApplication : Application() {


    override fun onCreate() {
        super.onCreate()
        sInstance = this
    }

    companion object {
        @JvmStatic
        private lateinit var sInstance: SampleApplication

        @JvmStatic
        fun getSampleApplication(): SampleApplication {
            return sInstance
        }
    }
}