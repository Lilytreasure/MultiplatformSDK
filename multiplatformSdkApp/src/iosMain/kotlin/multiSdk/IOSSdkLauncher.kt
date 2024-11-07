package multiSdk

import platform.UIKit.UIViewController
import sdkEntry.SdkLauncher

class IOSSdkLauncher(private val rootViewController: UIViewController) : SdkLauncher {
    override fun openSdkApp() {
        val sdkViewController = MainIosViewController() // Your SDK view controller
        rootViewController.presentViewController(sdkViewController, animated = true, completion = null)
    }
}