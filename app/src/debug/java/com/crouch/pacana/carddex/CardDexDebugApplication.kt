package com.crouch.pacana.carddex

import timber.log.Timber

/**
 * Debug Application class extending CardDexBaseApplication
 *
 * initializes debug logging using Timber
 */
class CardDexDebugApplication: CardDexBaseApplication() {

    override fun setupLogging() {
        Timber.plant(Timber.DebugTree())
        Timber.tag(TAG).d("logging initialized")
    }

    companion object {
        private const val TAG = "CardDexDebugApplication"
    }
}