package android.compose.learn.wiggles.components

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.model.Dog
import android.compose.learn.wiggles.model.Gender
import android.compose.learn.wiggles.model.Owner
import android.compose.learn.wiggles.ui.theme.WigglesTheme
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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import typography

@Composable
fun ItemDogCard(dog: Dog, onClick: (dog: Dog) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth().height(120.dp)
            .padding(vertical = 8.dp)
            .clickable(onClick = { onClick(dog) }),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 0.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onSurface)

    ) {
        Row(

            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            with(dog) {
                Image(
                    painter = painterResource(id = dog.image),
                    contentDescription = "dog image",
                    modifier = Modifier
                        .size(80.dp, 80.dp)
                        .clip(
                            RoundedCornerShape(12.dp)
                        )
                    , contentScale = ContentScale.Crop
                )
                Spacer(Modifier.width(16.dp))
                Column(verticalArrangement = Arrangement.SpaceBetween) {
                    Text(
                        text = dog.name,
                        color = MaterialTheme.colorScheme.surface,
                        style = typography.labelMedium.copy(fontSize = 16.sp,)
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "$age yrs | $gender",
                        color = MaterialTheme.colorScheme.surface,
                        style = typography.bodySmall.copy(fontSize = 12.sp)
                    )
                    Spacer(modifier = Modifier.weight(1.0f))
                    Distance(location)

                }
                Spacer(modifier = Modifier.weight(1.0F))
                Column(
                    horizontalAlignment = Alignment.End,
                    verticalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.height(80.dp)
                ) {
                    GenderTag(gender = gender)
                    TimeUploaded()
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
    WigglesTheme {

    ItemDogCard(dog = dog, onClick = { })
    }
}
