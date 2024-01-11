package android.compose.learn.wiggles.components

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.model.Dog
import android.compose.learn.wiggles.model.Gender
import android.compose.learn.wiggles.model.Owner
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import typography

@Composable
fun ItemDogCard(dog: Dog, onClick: (dog: Dog) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable(onClick = { onClick(dog) }),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onSurface)

    ) {
        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            with(dog) {
                Image(
                    painter = painterResource(id = dog.image),
                    contentDescription = "dog image",
                    modifier = Modifier
                        .size(80.dp)
                        .clip(
                            RoundedCornerShape(16.dp)
                        )
                )
                Spacer(Modifier.width(16.dp))
                Column(verticalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        text = dog.name,
                        color = MaterialTheme.colorScheme.surface,
                        fontWeight = FontWeight.Bold,
                        style = typography.labelMedium
                    )
                    Text(
                        text = "$age yrs | $gender",
                        color = MaterialTheme.colorScheme.surface,
                        style = typography.labelSmall
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Row {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_location),
                            contentDescription = "location icon",
                            modifier = Modifier.size(16.dp),
                            tint = Color.Red
                        )
                        Text(
                            text = location,
                            style = typography.labelSmall,
                            color = MaterialTheme.colorScheme.surface,
                            modifier = Modifier.padding(start = 8.dp)
                        )
                    }

                }
                Spacer(modifier = Modifier.weight(1.0F))
                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.height(80.dp)
                ) {
                    GenderTag(name = gender)
                    Text(
                        text = "12 min ago", style = typography.labelSmall,
                        color = MaterialTheme.colorScheme.surface,
                    )
                }

            }
        }
    }
}

@Preview
@Composable
fun ItemDogCardPreview() {
    val owner = Owner("Spikey Sanju", "Developer & Pet Lover", R.drawable.owner)
    val dog = Dog(
        0,
        "Hachiko",
        3.5,
        Gender.MALE,
        "Brown",
        12.9,
        "389m away",
        R.drawable.blue_dog,
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
        owner
    )
    ItemDogCard(dog = dog, onClick = { dog -> {} })
}
