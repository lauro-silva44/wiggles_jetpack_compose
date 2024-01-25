package android.compose.learn.wiggles.dogDetail

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.components.Distance
import android.compose.learn.wiggles.components.GenderTag
import android.compose.learn.wiggles.components.InfoCard
import android.compose.learn.wiggles.components.TimeUploaded
import android.compose.learn.wiggles.data.FakeDogDatabase
import android.compose.learn.wiggles.model.Dog
import android.compose.learn.wiggles.model.Owner
import android.compose.learn.wiggles.ui.theme.WigglesTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DogDetailScreen(
    navController: NavController,
    dogId: Int
) {
    val dogName = FakeDogDatabase.puppies.firstOrNull { it.id == dogId }
    if (dogName != null) {
        Scaffold(topBar = {
            Image(
                painter = painterResource(id = dogName.image),
                contentDescription = "",
                contentScale = ContentScale.FillWidth,
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
                scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior(rememberTopAppBarState()),
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
                    }
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = "",
                            tint = Color.LightGray,
                            modifier = Modifier
                                .size(24.dp, 24.dp)


                        )
                    }
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
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(
                horizontal =
                28.dp, vertical = 35.dp

            ),

        ) {

        dog.apply {
            item {
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                        Text(
                            text = name,
                            style = MaterialTheme.typography.headlineLarge,
                            color = MaterialTheme.colorScheme.surface,
                        )

                        Distance(location = location)

                        TimeUploaded()
                    }

                    GenderTag(gender = gender)
                }
            }
            item {

                Text(
                    text = "My Story",
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.surface,
                    modifier = Modifier.padding(top = 16.dp)
                )
            }
            item {

                Text(
                    text = about,
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Justify
                )
            }
            item {

                Text(
                    text = "Quick Info",
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.surface,
                )
            }
            item {

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    InfoCard(value = "$age yrs", fieldName = "Age")
                    InfoCard(value = color, fieldName = "Color")
                    InfoCard(value = "$weight kg", fieldName = "Weight")

                }//owner info
            }
            item {


                Text(
                    text = "Owner Info",
                    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold),
                    color = MaterialTheme.colorScheme.surface,
                )
            }
            item {

                OwnerInfo(owner)
                //adopt me button
            }
            item {

                Button(
                    shape = RoundedCornerShape(8),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = colorResource(id = R.color.blue)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(52.dp),
                    onClick = { }) {
                    Text(
                        "Adopt me",
                        style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Light),
                        color = MaterialTheme.colorScheme.onBackground,
                    )
                }
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DogDetailPreview() {
    val nav = rememberNavController();
    WigglesTheme(darkTheme = true) {
        DogDetailScreen(dogId = 9, navController = nav)
    }
}

@Composable
fun OwnerInfo(owner: Owner) {
    owner.apply {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(60.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = name,
                        style = MaterialTheme.typography.bodySmall,
                        color = MaterialTheme.colorScheme.surface,
                    )
                    Text(
                        text = bio,
                        style = MaterialTheme.typography.bodySmall.copy(
                            fontWeight = FontWeight.Light,
                            fontSize = 12.sp
                        ),
                        color = MaterialTheme.colorScheme.surface,
                    )
                }
            }
            Image(
                painterResource(id = R.drawable.messenger_icon),
                contentDescription = null
            )
        }
    }

}

