package android.compose.learn.wiggles.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import typography

@Composable
fun TimeUploaded() {
    Text(
        text = "12 min ago", style = typography.labelSmall,
        color = MaterialTheme.colorScheme.surface,
    )
}