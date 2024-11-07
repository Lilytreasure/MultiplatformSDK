import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

class AndroidPlatformContext(val context: Context) : PlatformContext

@Composable
actual fun getPlatformContext(): PlatformContext {
    val context = LocalContext.current
    return AndroidPlatformContext(context)
}