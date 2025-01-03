import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import rootBottomStack.RootBottomComponent
import rootBottomStack.RootBottomScreen


@Composable
fun MainView(
    component: RootBottomComponent,
    modifier: Modifier = Modifier,
    dismissSDk:()-> Unit
) = SdkUi(component, modifier,dismissSDk)

@Composable
fun SdkUi(component: RootBottomComponent, modifier: Modifier = Modifier, dismissSdk:()-> Unit) {
    Surface() {
        Column(
            Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            RootBottomScreen(component, modifier, closeSDk =dismissSdk)
        }
    }
}