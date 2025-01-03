package home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Tune
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import io.github.lilytreasure.multiplatformsdkapp.generated.resources.CoffeeCup
import io.github.lilytreasure.multiplatformsdkapp.generated.resources.Res
import io.github.lilytreasure.multiplatformsdkapp.generated.resources.imagee
import io.github.lilytreasure.multiplatformsdkapp.generated.resources.img
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import sdktheme.actionButtonColor


@OptIn(
    ExperimentalResourceApi::class
)
@Composable
fun WelcomeContent(
    component: HomeComponent,
    modifier: Modifier = Modifier,
    dismissSDk: () -> Unit
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = MaterialTheme.colorScheme.primary)
                    .padding(start = 16.dp, end = 16.dp, top = 7.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "Close",
                    modifier = Modifier.clickable {
                        //close sdk
                        dismissSDk()
                    },
                    style = MaterialTheme.typography.titleSmall,
                    color = Color.White
                )
                Column() {
                    Text(
                        text = "Multiplatform",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                    Text(
                        text = "Sdk",
                        style = MaterialTheme.typography.titleSmall,
                        color = MaterialTheme.colorScheme.onSecondaryContainer
                    )
                }
                //open file picker and set profile  picture

                Image(
                    painter = painterResource(Res.drawable.img),
                    contentDescription = "profile Picture",
                    modifier = Modifier
                        .width(44.dp)
                        .height(44.dp)
                )
            }

        },

        ) { innePadding ->
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding()
        ) {
            Column(modifier = Modifier.padding(innePadding)) {
                Box() {
                    Column(
                        modifier = Modifier
                            .background(color = MaterialTheme.colorScheme.primary)
                            .fillMaxHeight(0.3f)
                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 28.dp, start = 16.dp, end = 16.dp)
                        ) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier.padding(
                                        top = 17.dp,
                                        bottom = 17.dp,
                                        start = 16.dp
                                    )
                                ) {
                                    Row() {
                                        Icon(
                                            Icons.Outlined.Search,
                                            contentDescription = "Search"
                                        )
                                        Text(
                                            modifier = Modifier.padding(start = 1.dp),
                                            text = "Search Coffee",
                                            style = MaterialTheme.typography.bodySmall
                                        )
                                    }
                                }
                                Icon(
                                    Icons.Outlined.Tune,
                                    contentDescription = "filter",
                                    modifier = Modifier
                                        .size(40.dp)
                                        .background(
                                            color = MaterialTheme.colorScheme.tertiary,
                                            shape = RoundedCornerShape(14.dp)
                                        ),
                                    tint = MaterialTheme.colorScheme.onSecondaryContainer
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.41f)
                            .padding(top = 110.dp, start = 16.dp, end = 16.dp),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Card(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight(),
                            shape = RoundedCornerShape(16.dp),
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = painterResource(Res.drawable.imagee),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .matchParentSize()
                                )
                                Column() {
                                    Row(
                                        modifier = Modifier
                                            .padding(start = 16.dp)
                                    ) {
                                        ElevatedButtonExample()
                                    }

                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.Start,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "Buy one get one FREE",
                                            style = MaterialTheme.typography.titleLarge,
                                            color = MaterialTheme.colorScheme.onSecondaryContainer,
                                            modifier = Modifier
                                                .fillMaxWidth(0.5f)
                                                .padding(start = 16.dp),
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
                Column() {
                    LazyRow(
                        modifier = Modifier
                            .padding(top = 20.dp, start = 16.dp, end = 16.dp)
                    ) {
                        items(5) {
                            FilledTonalButton { }
                            Spacer(modifier = Modifier.padding(start = 5.dp))
                        }
                    }
                    LazyVerticalStaggeredGrid(
                        columns = StaggeredGridCells.Fixed(2),
                        verticalItemSpacing = 10.dp,
                        horizontalArrangement = Arrangement.spacedBy(24.dp),
                        content = {
                            items(10) {
                                ProductsCard()
                            }
                        },
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(top = 20.dp, start = 16.dp, end = 16.dp)
                    )
                }
            }
        }
    }
}

@Composable
fun FilledTonalButton(onClick: () -> Unit) {
    FilledTonalButton(onClick = { onClick() }) {
        Text(
            "Cappuccino",
            style = MaterialTheme.typography.labelLarge
        )
    }
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun ProductsCard() {
    ElevatedCard() {
        Column() {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painterResource(Res.drawable.CoffeeCup),
                    contentDescription = null,
                    contentScale = ContentScale.FillWidth,
                    modifier = Modifier.fillMaxSize()
                )
                Column() {
                    Text(
                        text = "6.5",
                        modifier = Modifier.padding(start = 12.dp),
                        color = MaterialTheme.colorScheme.onSecondaryContainer,
                        style = MaterialTheme.typography.labelMedium
                    )
                }
            }
            Column(modifier = Modifier.padding(top = 12.dp, start = 12.dp)) {
                Text(
                    text = "Cappucino",
                    style = MaterialTheme.typography.bodyMedium
                )
                Text(
                    text = "with Chocolate",
                    style = MaterialTheme.typography.bodyMedium
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        text = "$ 4.53",
                        style = MaterialTheme.typography.labelLarge
                    )
                }
            }
        }

    }
}

@Composable
fun ElevatedButtonExample() {
    ElevatedButton(modifier = Modifier
        .height(35.dp),
        colors = ButtonDefaults.buttonColors(containerColor = actionButtonColor),
        onClick = { }) {
        Text("Promo")
    }
}