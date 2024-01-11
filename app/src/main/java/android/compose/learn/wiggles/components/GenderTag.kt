package android.compose.learn.wiggles.components

import android.compose.learn.wiggles.R
import android.compose.learn.wiggles.model.Gender
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun GenderTag(gender: Gender) {
    val color = if (gender.name == "MALE") R.color.blue else R.color.red
    ChipView(gender = gender, colorResource = colorResource(id = color))
}

@Composable
fun ChipView(gender: Gender, colorResource: Color) {
    Box(
        modifier = Modifier
            .wrapContentWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(
                colorResource.copy(.08f)
            )

    ) {

        val genderName = gender.name.lowercase()
        Text(
            text = genderName.replaceFirstChar { it.uppercase() },
            modifier = Modifier.padding(
                vertical = 6.dp, horizontal = 12.dp,
            ),
            style = MaterialTheme.typography.labelSmall,
            color = colorResource
        )
    }
}

@Preview(name = "GenderTag")
@Composable
fun GenderTagPreview() {
    GenderTag(gender = Gender.FEMALE)
}