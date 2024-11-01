package com.dennis.multicontacts

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import multiContacts.AndroidSdkLauncher
import multiContacts.SdkMainActivity
import sdkEntry.MySdk

class MainActivity : AppCompatActivity() {
    val sdkLauncher = AndroidSdkLauncher(this)
    val mySdk = MySdk(sdkLauncher)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.fillMaxSize()) {
                Button(modifier = Modifier.padding(top = 16.dp),
                    onClick = {
                    try {
                        mySdk.launch()
                    }catch (e: Exception){
                        println("Error occured;;;;" + e)
                    }
                    // Launch the SDK
                }) {
                    Text("Open SDK")
                }

            }
        }
    }

    override fun onResume() {
        super.onResume()
    }
}
