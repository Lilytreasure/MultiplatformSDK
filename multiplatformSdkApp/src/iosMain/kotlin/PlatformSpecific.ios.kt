import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.ImageBitmap

actual open class PlatformSpecific {
    actual fun loadFiles(callback: (ImageBitmap?) -> Unit) {
    }

    actual fun loadImages(callback: (ImageBitmap?) -> Unit) {
    }

    actual fun launchDialer(phoneNumber: String) {
    }

    @Composable
    actual fun UploadFiles() {
    }

    @Composable
    actual fun CameraView() {
    }

}