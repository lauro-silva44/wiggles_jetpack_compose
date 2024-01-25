package android.compose.learn.wiggles.home

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.components.ItemDogCard
import android.compose.learn.wiggles.components.TopBar
import android.compose.learn.wiggles.data.FakeDogDatabase
import android.compose.learn.wiggles.model.Dog
import android.compose.learn.wiggles.model.Owner
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import typography

val owner = Owner("Spikey Sanju", "Developer & Pet Lover", R.drawable.owner)


@Preview
@Composable
fun HomeScreen(onDogClick:(Dog)-> Unit ={}) {
    Scaffold(
        topBar = {
            TopBar()
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding),
            contentPadding = PaddingValues(16.dp)
        ) {


            item {
                Text(
                    text = "Nearby results",
                    color = MaterialTheme.colorScheme.onBackground,
                    style = typography.bodyMedium.copy(fontSize = 14.sp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }
            items(count = FakeDogDatabase.puppies.size) { index ->
                val puppy = FakeDogDatabase.puppies[index]
                ItemDogCard(dog = puppy, onClick = onDogClick)
            }
        }
    }
}





