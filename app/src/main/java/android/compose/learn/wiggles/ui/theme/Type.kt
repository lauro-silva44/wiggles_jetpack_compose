import android.compose.learn.wiggles.R
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

private val Sailec = FontFamily(
    Font(R.font.sailec_regular),
    Font(R.font.sailec_medium, FontWeight.W500),
    Font(R.font.sailec_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val typography = Typography(
    headlineSmall = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W700,
        fontSize = 16.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    titleSmall = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    titleLarge = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = Sailec,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    labelMedium = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    labelSmall = TextStyle(
        fontFamily = Sailec,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp

    )
)
