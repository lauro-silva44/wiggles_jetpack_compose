package android.compose.learn.wiggles.dogDetail

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.components.GenderTag
import android.compose.learn.wiggles.data.FakeDogDatabase
import android.compose.learn.wiggles.model.Dog
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DogDetailScreen(
    dogId: Int
) {
    val navController = rememberNavController()
    val dogName = FakeDogDatabase.puppies.firstOrNull { it.id == dogId }
    if (dogName != null) {
        Scaffold(topBar = {
            Image(
                painter =  painterResource(id = dogName.image),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(346.dp)
            )
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Transparent
                ),
                title = {
                },
                actions = {
                          IconButton(onClick = { /*TODO*/ }) {
                              Icon(imageVector = Icons.Default.Favorite, contentDescription = "" )
                          }
                },
                navigationIcon = {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "",
                        modifier = Modifier
                            .size(24.dp, 24.dp)
                            .clickable {
                                navController.navigateUp()
                            },
                        tint = colorResource(id = R.color.text)
                    )
                }

            )
        }) { paddingSomething ->
            Column(modifier = Modifier.padding(paddingSomething)) {
                DetailsView(dogName)
            }
        }


    }

}


@Composable
fun DetailsView(dog: Dog) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(color = colorResource(id = R.color.background))
    ) {
        item {
            dog.apply {
                Row(horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()) {
                    Text(text = name)
                    GenderTag(gender = gender )
                }
                Text(text = about)

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DogDetailPreview() {
    DogDetailScreen(dogId = 9)
}