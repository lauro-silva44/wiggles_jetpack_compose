package android.compose.learn.wiggles

import android.compose.learn.wiggles.ui.theme.WigglesTheme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WigglesTheme(darkTheme = true) {
                Surface(color = MaterialTheme.colorScheme.background) {
                    WiggleNavHost()
                }

            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WigglesTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colorScheme.background) {
            WiggleNavHost()
        }
    }
}