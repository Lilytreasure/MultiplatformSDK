package multiSdk

import MainView
import PlatformSpecific
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import di.initKoin
import org.koin.core.error.KoinAppAlreadyStartedException
import platform.UIKit.UIViewController
import rootBottomStack.DefaultRootBottomComponent
import sdktheme.AppTheme

fun MainIosViewController(
): UIViewController {
    val defaultComponentCtx = DefaultComponentContext(lifecycle = LifecycleRegistry())
    val root = DefaultRootBottomComponent(
        componentContext = defaultComponentCtx,
    )
   // initKoin(enableNetworkLogs = true, platform = PlatformSpecific())
    try {
        initKoin(enableNetworkLogs = true, platform = PlatformSpecific())
        println("Koin app  Started::;::::")
    } catch (e: KoinAppAlreadyStartedException) {
        println("Koin app  Failed::;::::")
        e.printStackTrace()
    }
    return ComposeUIViewController {
        AppTheme {
            MainView(root)
        }
    }
}

