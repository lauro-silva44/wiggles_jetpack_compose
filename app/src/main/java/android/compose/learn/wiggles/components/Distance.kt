package android.compose.learn.wiggles.components

import android.compose.learn.wiggles.R
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import typography

@Composable
fun Distance(location: String) {
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