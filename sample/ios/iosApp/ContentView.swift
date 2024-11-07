
import SwiftUI
import Common


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



