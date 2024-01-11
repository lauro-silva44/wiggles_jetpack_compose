package android.compose.learn.wiggles.components

import android.compose.learn.wiggles.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import typography

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopBar() {
    TopAppBar(title = {
        Column {
            Text(
                text = "Hey Mowa",
                style = typography.headlineMedium,
                color = MaterialTheme.colorScheme.surface
            )
            Text(
                text = "Adopt a new friend near you!",
                style = typography.bodyMedium,
                color = MaterialTheme.colorScheme.surface
            )
        }
    }, colors = TopAppBarDefaults.topAppBarColors(
        containerColor = MaterialTheme.colorScheme.onBackground,

        ), actions = {

        var icon by remember { mutableIntStateOf(R.drawable.ic_light_off) }
        IconButton(modifier = Modifier.padding(end = 16.dp), onClick = {
            icon = if (icon == R.drawable.ic_light_off) {
                R.drawable.ic_light_on
            } else {
                R.drawable.ic_light_off
            }
        }) {
            Icon(
                painter = painterResource(id = icon),
                tint = MaterialTheme.colorScheme.surface,
                contentDescription = "icon",
                modifier = Modifier.size(32.dp)

            )
        }
    })
}

@Preview
@Composable
fun TopBarPreview() {
    TopBar()
}