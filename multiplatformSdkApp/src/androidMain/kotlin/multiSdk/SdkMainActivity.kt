package multiSdk

import MainView
import PlatformSpecific
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.arkivanov.decompose.defaultComponentContext
import di.initKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.error.KoinAppAlreadyStartedException
import rootBottomStack.DefaultRootBottomComponent
import sdktheme.AppTheme

class SdkMainActivity : AppCompatActivity() {
    private var platform: PlatformSpecific? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        platform = PlatformSpecific(this)
        val root = DefaultRootBottomComponent(
            componentContext = defaultComponentContext(),
        )
        try {
            val koinApplication = initKoin(
                // add to build configuration, false in prod
                enableNetworkLogs = true,
                platform = platform
            )
            println("Koin app  Started::;::::")
            koinApplication.androidContext(applicationContext)
        } catch (e: KoinAppAlreadyStartedException) {
            println("Koin app  Failed::;::::")
            e.printStackTrace()
        }

        setContent {
            AppTheme {
                MainView(root, dismissSDk = {
                    finish()
                })
            }

        }
    }
}

