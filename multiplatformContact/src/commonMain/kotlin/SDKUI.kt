import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import sdktheme.AppTheme


@Composable
fun SdkEntryUi(){
    AppTheme {
        SdkUi()
    }
}

@Composable
fun SdkUi() {
    Scaffold(modifier = Modifier
        .fillMaxSize()) { padding ->
        Column(modifier = Modifier
            .padding(padding).padding(16.dp)
            .fillMaxSize()){
            Text(
                "Welcome to the SDK Parent Screen!",
                color = Color.Black,
                modifier = Modifier.padding(padding)
            )
            Text(
                "Welcome to the SDK Parent Screen!",
                color = MaterialTheme.colorScheme.primary,
                modifier = Modifier.padding(top = 49.dp)
            )
            Button(onClick = {

            }){
                Text("sdk ui")
            }
        }
    }
}