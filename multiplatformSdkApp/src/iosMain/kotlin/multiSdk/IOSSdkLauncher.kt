package multiSdk

import platform.UIKit.UIModalPresentationFullScreen
import platform.UIKit.UIViewController
import sdkEntry.SdkLauncher

class IOSSdkLauncher(private val rootViewController: UIViewController) : SdkLauncher {
    override fun openSdkApp() {
        val sdkViewController = MainIosViewController() // Your SDK view controller
        //val view = ComposeUIViewController { MainIosViewController() }
        sdkViewController.modalPresentationStyle = UIModalPresentationFullScreen
        sdkViewController.prefersStatusBarHidden
        rootViewController.prefersStatusBarHidden()
        rootViewController.presentViewController(sdkViewController, animated = true, completion = null)
    }

}
