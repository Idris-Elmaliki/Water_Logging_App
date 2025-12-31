package com.example.water_logging_app.ui.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
<<<<<<< Updated upstream
import com.example.water_logging_app.ui.screens.HistoryScreen
import com.example.water_logging_app.ui.screens.HomeScreen
import com.example.water_logging_app.ui.screens.SettingScreen

enum class UiNavigationRoutesEnum() {
    Home,
    Setting,
    History,
    AddWater
}

=======
import androidx.navigation.compose.navigation
import com.example.water_logging_app.ui.mainpage.WaterLogUiLayout
import com.example.water_logging_app.ui.mainpage.main_screens.HistoryScreen
import com.example.water_logging_app.ui.mainpage.main_screens.HomeScreen
import com.example.water_logging_app.ui.mainpage.main_screens.SettingScreen


const val TWEEN_AMOUNT = 550

enum class UiNavigationRoutesEnum() {
    AuthGraph,
        LoadingScreen,
        LoginScreen,
        MainPage,
            Home,
                AddWater,
            Setting,
            History,

}

/*
* I want the Water Logging Screen to not be apart of the main navigation screen
* It will be a pop-up screen once they user includes that overlays the entire screen!
* -------
* Solved!
 */

>>>>>>> Stashed changes
@Composable
fun UiNavigationRoutes(
    navController : NavHostController,
    modifier: Modifier = Modifier,
) {
    NavHost(
        navController = navController,
        startDestination = UiNavigationRoutesEnum.AuthGraph.name,
        modifier = modifier
    ) {
        loadingScreen(navController, modifier)

        // I navigate to the entire ui instead of one by one
        // This allows me to ensure that the bottom navBar isn't universal!
        composable(
            route = UiNavigationRoutesEnum.MainPage.name,
        ) {
            WaterLogUiLayout(
                rootNavController = navController,
                modifier = modifier
            )
        }

        addWater(navController, modifier)

        homeGraph(navController, modifier)
    }
}

fun NavGraphBuilder.loadingScreen(
    navController : NavController,
    modifier : Modifier = Modifier
) {
    navigation(
        route = UiNavigationRoutesEnum.AuthGraph.name,
        startDestination = UiNavigationRoutesEnum.LoadingScreen.name
    ) {
        composable(
            route = UiNavigationRoutesEnum.LoadingScreen.name,
        ) {

        }
        composable(
            route = UiNavigationRoutesEnum.LoginScreen.name,
        ) {

        }
    }
}


fun NavGraphBuilder.homeGraph(
    navController : NavController,
    modifier : Modifier = Modifier
) {
    navigation(
        route = UiNavigationRoutesEnum.MainPage.name,
        startDestination = UiNavigationRoutesEnum.Home.name
    ) {
        composable(
            route = UiNavigationRoutesEnum.Home.name,
            arguments = listOf(/*this will be very useful for loading the users data!*/),
            deepLinks = listOf(/*I will need to implement this soon, will be useful for push notifications!*/),
            enterTransition = {
<<<<<<< Updated upstream
=======
                when (initialState.destination.route) {
                    UiNavigationRoutesEnum.Setting.name -> {
                        slideIntoContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Left,
                            animationSpec = tween(TWEEN_AMOUNT)
                        )
                    }

                    UiNavigationRoutesEnum.History.name -> {
                        slideIntoContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Right,
                            animationSpec = tween(TWEEN_AMOUNT)
                        )
                    }

                    UiNavigationRoutesEnum.AddWater.name -> {
                        slideIntoContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Down,
                            animationSpec = tween(TWEEN_AMOUNT)
                        )
                    }

                    else -> {
                        EnterTransition.None
                    }
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    UiNavigationRoutesEnum.Setting.name -> {
                        slideOutOfContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Right,
                            animationSpec = tween(TWEEN_AMOUNT)
                        )
                    }

                    UiNavigationRoutesEnum.History.name -> {
                        slideOutOfContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Left,
                            animationSpec = tween(TWEEN_AMOUNT)
                        )
                    }

                    UiNavigationRoutesEnum.AddWater.name -> {
                        slideOutOfContainer(
                            towards = AnimatedContentTransitionScope.SlideDirection.Down,
                            animationSpec = tween(TWEEN_AMOUNT)
                        )
                    }

                    else -> {
                        ExitTransition.None
                    }
                }
            }
        ) {
            HomeScreen(
                onButtonClick = {
                    navController.navigate(UiNavigationRoutesEnum.AddWater.name)
                }
            )
        }
        composable(
            route = UiNavigationRoutesEnum.Setting.name,
            enterTransition = {
>>>>>>> Stashed changes
                slideIntoContainer(
                    towards = if(initialState.destination.route == UiNavigationRoutesEnum.Setting.name) {
                        AnimatedContentTransitionScope.SlideDirection.Left
                    }
                    else {
                        AnimatedContentTransitionScope.SlideDirection.Right
                    }
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = if(targetState.destination.route == UiNavigationRoutesEnum.Setting.name) {
                        AnimatedContentTransitionScope.SlideDirection.Right
                    } else {
                        AnimatedContentTransitionScope.SlideDirection.Left
                    }
                )
            }
        ) {
            HomeScreen(
                onButtonClick = {
                    // navController.navigate(UiNavigationRoutesEnum.AddWater.name)
                }
            )
        }
        composable(
            route = UiNavigationRoutesEnum.Setting.name,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left
                )
            }
        ) {
            SettingScreen(
                modifier = modifier
            )
        }
        composable(
            route = UiNavigationRoutesEnum.History.name,
            enterTransition = {
                slideIntoContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Left
                )
            },
            exitTransition = {
                slideOutOfContainer(
                    towards = AnimatedContentTransitionScope.SlideDirection.Right
                )
            }
        ) {
            HistoryScreen(
                modifier = modifier
            )
        }
    }
}

<<<<<<< Updated upstream
=======
fun NavGraphBuilder.addWater(
    navController : NavController,
    modifier : Modifier = Modifier
) {
    composable(
        route = UiNavigationRoutesEnum.AddWater.name,
        enterTransition = {
            slideIntoContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Down,
                animationSpec = tween(TWEEN_AMOUNT)
            )
        },
        exitTransition = {
            slideOutOfContainer(
                towards = AnimatedContentTransitionScope.SlideDirection.Up,
                animationSpec = tween(TWEEN_AMOUNT)
            )
        }
    ) {
    }
}
>>>>>>> Stashed changes
