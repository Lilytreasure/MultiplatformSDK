package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.Font
import ui.theme.Black
import ui.theme.Blue400
import ui.theme.DarkGray400
import ui.theme.Gray400
import ui.theme.Green200
import ui.theme.Green300
import ui.theme.Green400
import ui.theme.LightGray400
import ui.theme.Shapes
import ui.theme.primaryColor


private val DarkColorScheme = darkColorScheme(
    primary = primaryColor,
    secondary = Green300,
    tertiary = Blue400,

    background = Black,
    surface = DarkGray400,
    surfaceVariant = Gray400,
    onPrimary = Color.White,
    onSecondary = Color.White,
    secondaryContainer = Green200,
    onBackground = Color.White,
    onSurface = Color.White,
    onSurfaceVariant = LightGray400,
    outline = LightGray400,
    tertiaryContainer = Green400
)

private val LightColorScheme = lightColorScheme(
    primary = primaryColor,
    secondary = Green300,
    tertiary = Blue400,
    background = Color(0xFFF7F7F7),
    surface = Color(0xFFF7F7F7),
    surfaceVariant = Gray400,
    onPrimary = Color.White,
    onSecondary = Color.White,
    secondaryContainer = Green200,
    onBackground = Black,
    onSurface = Black,
    onSurfaceVariant = DarkGray400,
    outline = LightGray400,
    inverseOnSurface = Color(0xFFFFFFFF),
    tertiaryContainer = Green400
)

@OptIn(ExperimentalResourceApi::class)
@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {

    val colors = if (!useDarkTheme) {
        LightColorScheme
    } else {
        DarkColorScheme
    }
    

    MaterialTheme(
        colorScheme = colors,
        typography = Typography(
            displayLarge = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 57.sp,
                lineHeight = 64.0.sp,
                letterSpacing = (-0.2).sp,
                fontFamily = FontFamily.Default
            ),
            displayMedium = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 45.sp,
                lineHeight = 52.0.sp,
                letterSpacing = 0.0.sp,
                fontFamily =FontFamily.Default
            ),
            displaySmall = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 36.sp,
                lineHeight = 44.0.sp,
                letterSpacing = 0.0.sp,
                fontFamily = FontFamily.Default
            ),
            headlineLarge = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 32.sp,
                lineHeight = 40.0.sp,
                letterSpacing = 0.0.sp,
                fontFamily = FontFamily.Default
            ),
            headlineMedium = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 28.sp,
                lineHeight = 36.0.sp,
                letterSpacing = 0.0.sp,
                fontFamily = FontFamily.Default
            ),
            headlineSmall = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 24.sp,
                lineHeight = 32.0.sp,
                letterSpacing = 0.0.sp,
                fontFamily = FontFamily.Default
            ),
            titleLarge = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 22.sp,
                lineHeight = 28.0.sp,
                letterSpacing = 0.0.sp,
                fontFamily = FontFamily.Default
            ),
            titleMedium = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 16.sp,
                lineHeight = 24.0.sp,
                letterSpacing = 0.2.sp,
                fontFamily =FontFamily.Default
            ),
            titleSmall = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.0.sp,
                letterSpacing = 0.1.sp,
                fontFamily = FontFamily.Default
            ),
            bodyLarge = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                lineHeight = 24.0.sp,
                letterSpacing = 0.5.sp,
                fontFamily =FontFamily.Default
            ),
            bodyMedium = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 20.0.sp,
                letterSpacing = 0.2.sp,
                fontFamily = FontFamily.Default
            ),
            bodySmall = TextStyle(
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 16.0.sp,
                letterSpacing = 0.4.sp,
                fontFamily = FontFamily.Default
            ),
            labelLarge = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 20.0.sp,
                letterSpacing = 0.1.sp,
                fontFamily = FontFamily.Default
            ),
            labelMedium = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 16.0.sp,
                letterSpacing = 0.5.sp,
                fontFamily = FontFamily.Default
            ),
            labelSmall = TextStyle(
                fontWeight = FontWeight.Medium,
                fontSize = 11.sp,
                lineHeight = 16.0.sp,
                letterSpacing = 0.5.sp,
                fontFamily = FontFamily.Default
            )
        ),
        shapes = Shapes,
        content = content
    )
}
