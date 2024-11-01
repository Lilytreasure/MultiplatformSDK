import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun SdkUi() {
    Scaffold(modifier = Modifier
        .fillMaxSize(),
        backgroundColor = Color.Blue) { padding ->
        Text(
            "Welcome to the SDK Parent Screen!",
            color = Color.Black,
            modifier = Modifier.padding(padding)
        )
        Text(
            "Welcome to the SDK Parent Screen!",
            color = Color.Black,
            modifier = Modifier.padding(top = 49.dp)
        )
    }


}