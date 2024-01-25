package android.compose.learn.wiggles.components

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.data.FakeDogDatabase
import android.compose.learn.wiggles.model.Dog
import android.compose.learn.wiggles.model.Gender
import android.compose.learn.wiggles.ui.theme.WigglesTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun InfoCard(value: String, fieldName: String) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onSurface
        ),
        modifier = Modifier
            .size(height = 60.dp, width = 91.dp )
            .clip(shape = RoundedCornerShape(size = 12.dp))
    ) {

        Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxSize()) {
            Text(text = value, style = MaterialTheme.typography.bodyLarge.copy(fontSize = 16.sp), color = MaterialTheme.colorScheme.surface)
            Text(text = fieldName, style = MaterialTheme.typography.bodySmall.copy(fontWeight = FontWeight.Light), color = Color.DarkGray)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InfoCardPreview() {
    val dog = Dog(
        id = 10,
        name = "Rafik",
        age = 3.5,
        gender = Gender.FEMALE,
        color = "Brown",
        weight = 12.9,
        location = "389m away",
        R.drawable.suprised_one,
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries,",
        FakeDogDatabase.owner
    );
    WigglesTheme {
//        InfoCard(dog = dog)
    }
}