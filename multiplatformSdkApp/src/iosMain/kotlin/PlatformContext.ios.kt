import androidx.compose.runtime.Composable

object IOSPlatformContext : PlatformContext
@Composable
actual fun getPlatformContext(): PlatformContext = IOSPlatformContext