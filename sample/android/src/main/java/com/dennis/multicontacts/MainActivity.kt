package com.dennis.multicontacts

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import multicontactSample.MainAppEntry

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAppEntry()
        }
    }

    override fun onResume() {
        super.onResume()
    }
}
