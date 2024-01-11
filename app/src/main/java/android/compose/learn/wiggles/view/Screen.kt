package android.compose.learn.wiggles.view

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Screen(val route: String, val navArgument: List<NamedNavArgument> = emptyList()) {
    data object Home : Screen("home")
    data object DogDetail : Screen(
        route = "dogDetail/{dogId}",
        navArgument = listOf(navArgument(name = "dogId"){
            type = NavType.StringType
        })
    ){
        fun createRoute(dogId: Int) = "dogDetail/${dogId}"
    }

}