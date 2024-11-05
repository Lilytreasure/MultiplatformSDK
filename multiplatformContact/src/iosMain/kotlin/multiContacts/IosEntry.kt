package multiContacts

import MainView
import PlatformSpecific
import androidx.compose.ui.window.ComposeUIViewController
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import di.initKoin
import platform.UIKit.UIViewController
import rootBottomStack.DefaultRootBottomComponent
import sdktheme.AppTheme

fun MainIosViewController(
): UIViewController {
    val defaultComponentCtx = DefaultComponentContext(lifecycle = LifecycleRegistry())
    val root = DefaultRootBottomComponent(
        componentContext = defaultComponentCtx,
    )
    initKoin(enableNetworkLogs = true, platform = PlatformSpecific())
    return ComposeUIViewController {
        AppTheme {
            MainView(root)
        }
    }
}

