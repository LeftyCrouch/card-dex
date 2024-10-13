package com.crouch.pacana.carddex.firebase

import android.util.Log
import com.google.firebase.crashlytics.ktx.crashlytics
import com.google.firebase.ktx.Firebase
import timber.log.Timber

/**
 * Firebase Logger to help trace crashes in release builds.
 * This class sends logs to Crashlytics that will be part of crash reports.
 *
 * It also logs exceptions thrown that did not cause a crash, but could have
 *  a negative impact on user experience.
 *
 * Release build will just log INFO, WARNING, or ERROR
 */
class FirebaseLogger: Timber.Tree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority != Log.DEBUG && priority != Log.VERBOSE) {
            Firebase.crashlytics.log("$tag: $message")
            if (t != null) {
                Firebase.crashlytics.recordException(t)
            }
        }
    }
}