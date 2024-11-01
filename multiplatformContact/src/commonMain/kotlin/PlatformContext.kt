import androidx.compose.runtime.Composable

interface PlatformContext
@Composable
expect fun getPlatformContext(): PlatformContext