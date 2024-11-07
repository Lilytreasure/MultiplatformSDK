

<p align="center">
👻 Multiplatform SDK is an SDk built in Kotlin Multiplatform(ui Compose Multiplatform) targeting Android And iOS.
</p><br>


## Usage on Android

```kotlin

class MainActivity : ComponentActivity() {
    //Sdk Entry point from Android
    val sdkLauncher = AndroidSdkLauncher(this)
    val mySdk = MySdk(sdkLauncher)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
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
    }
    override fun onResume() {
        super.onResume()
    }
}

```


## Usage on iOS


```swift

struct ContentView: View {
    // Sdk Entry point from iOS
    var body: some View {
        VStack {
            Text("Welcome to the Host App")
            Button("Open SDK") {
                openSdk()
            }
        }
    }
    
    private func openSdk() {
        if let rootViewController = UIApplication.shared.windows.first?.rootViewController {
            let sdkLauncher = IOSSdkLauncher(rootViewController: rootViewController)
            sdkLauncher.openSdkApp()
        }
    }
}

