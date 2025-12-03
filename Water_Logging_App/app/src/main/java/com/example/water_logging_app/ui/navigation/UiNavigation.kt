package com.example.water_logging_app.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

enum class UiNavigationRoutesEnum() {
    Home,
    Setting,
    History
}

@Composable
fun UiNavigationRoutes(
    modifier: Modifier = Modifier,
    navController : NavHostController = rememberNavController()
) {
    NavHost(
        navController = navController,
        startDestination = UiNavigationRoutesEnum.Home.name,
        modifier = modifier
    ) {
        composable(
            route = UiNavigationRoutesEnum.Home.name
        ) {

        }
        composable(
            route = UiNavigationRoutesEnum.Setting.name
        ) {

        }
        composable(
            route = UiNavigationRoutesEnum.History.name
        ) {

        }
    }
}

