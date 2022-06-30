package com.sbsj.mytodoapp

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        //TODO Koin Trigger
        startKoin {
            androidLogger(Level.ERROR)
            androidContext(this@MyApplication)
            modules()



        }
    }
}

