package android.compose.learn.wiggles

import android.compose.learn.wiggles.dogDetail.DogDetailScreen
import android.compose.learn.wiggles.home.HomeScreen
import android.compose.learn.wiggles.view.Screen
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun WiggleNavHost(navController: NavHostController =  rememberNavController()) {
    NavHost(navController = navController, startDestination = Screen.Home.route){
        composable(route= Screen.Home.route) {
            HomeScreen(
        onDogClick = {
            navController.navigate(
                Screen.DogDetail.createRoute(
                    dogId = it.id
                )
            )
        }
            )

        }
        composable(route = Screen.DogDetail.route, arguments = listOf(navArgument("dogId") { type = NavType.IntType }) ) {
             DogDetailScreen(dogId = it.arguments?.getInt("dogId")?:0)
        }
    }
}

