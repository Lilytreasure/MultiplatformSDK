import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SdkUi() {
    Scaffold(modifier = Modifier.fillMaxSize()) { padding ->
        Text(
            "Welcome to the SDK Parent Screen!",
            modifier = Modifier.padding(padding)
        )
    }


}