package multiContacts

import android.content.Context
import android.content.Intent
import sdkEntry.SdkLauncher

class AndroidSdkLauncher(private val context: Context) : SdkLauncher {
    override fun openSdkApp() {
        val intent = Intent(context, SdkMainActivity::class.java)
        context.startActivity(intent)
    }
}