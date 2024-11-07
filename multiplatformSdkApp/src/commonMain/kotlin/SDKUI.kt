import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import rootBottomStack.RootBottomComponent
import rootBottomStack.RootBottomScreen


@Composable
fun MainView(component: RootBottomComponent, modifier: Modifier = Modifier) = SdkUi(component, modifier)

@Composable
fun SdkUi(component: RootBottomComponent, modifier: Modifier = Modifier) {
        androidx.compose.material3.Scaffold() { paddingFromPrent ->
            Column(
                Modifier
                    .padding(paddingFromPrent)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                RootBottomScreen(component, modifier)
            }
        }
}