package multicontactSample

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import multiContacts.pickMultiplatformContacts
import theme.AppTheme


@Composable
fun MainAppEntry(){
    AppTheme {
        Sample()
    }
}

@Composable
fun Sample() {
    var number by remember { mutableStateOf("") }
    val multiplatformContactsPicker = pickMultiplatformContacts(onResult = {phoneData->
        number=phoneData
    })
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerpadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerpadding)
        ) {
            Text(
                "Sample tests",
                modifier = Modifier.padding(top = 20.dp)
            )
            Text(
                "Number is" + number,
                modifier = Modifier.padding(top = 20.dp)
            )
            Text("Sample2")
            Button(modifier = Modifier.padding(top = 16.dp),
                onClick = {
                    multiplatformContactsPicker.launch()
                }) {
                Text("Run")
            }

            Button(modifier = Modifier.padding(top = 16.dp),
                onClick = {






                }) {
                Text("Open SDk")
            }
        }
    }
}