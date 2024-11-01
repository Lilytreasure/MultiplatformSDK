package sdkEntry

interface SdkLauncher {
    fun openSdkApp()
}

class MySdk(private val sdkLauncher: SdkLauncher) {
    fun launch() {
        sdkLauncher.openSdkApp()
    }
}