package com.crouch.pacana.carddex

import android.app.Application

/**
 * Base Application class extending base Android Application class.
 *
 * initializes logging
 */
abstract class CardDexBaseApplication: Application() {

    /**
     * Release and Debug application will setup logging differently.
     * This approach is used rather than using the BuildConfig
     */
    abstract fun setupLogging()

    override fun onCreate() {
        super.onCreate()

        setupLogging()
    }
}