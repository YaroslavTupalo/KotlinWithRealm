package com.yaroslavtupalo.kotlinwithrealm

import android.app.Application
import io.realm.Realm

/**
 * Created by Yaroslav on 04.12.2017.
 */
class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // Initialize Realm. Should only be done once when the application starts.
        Realm.init(this)
    }
}