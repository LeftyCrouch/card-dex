package com.crouch.pacana.carddex

import com.crouch.pacana.carddex.firebase.FirebaseLogger
import timber.log.Timber

/**
 * Release Application class extending CardDexBaseApplication
 *
 * initializes logging using Timber and sends logs to Firebase Crashlytics
 */
class CardDexReleaseApplication: CardDexBaseApplication() {

    override fun setupLogging() {
        Timber.plant(FirebaseLogger())
        Timber.tag(TAG).i("logging initialized")
    }

    companion object {
        private const val TAG = "CardDexReleaseApplication"
    }
}