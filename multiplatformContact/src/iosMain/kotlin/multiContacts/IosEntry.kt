package multiContacts

import SdkEntryUi
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun MainIosViewController(): UIViewController =
    ComposeUIViewController {
       SdkEntryUi()
    }