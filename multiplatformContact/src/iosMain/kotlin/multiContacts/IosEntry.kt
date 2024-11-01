package multiContacts

import SdkUi
import androidx.compose.ui.window.ComposeUIViewController
import platform.UIKit.UIViewController

fun MainIosViewController(): UIViewController =
    ComposeUIViewController {
        //Sample()
       SdkUi()
    }