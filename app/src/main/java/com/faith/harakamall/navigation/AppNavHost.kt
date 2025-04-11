package com.faith.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.faith.harakamall.ui.screens.about.AboutScreen
import com.faith.harakamall.ui.screens.dashboard.DashbaordScreen
import com.faith.harakamall.ui.screens.home.Homescreen
import com.faith.harakamall.ui.screens.item.ItemScreen
import com.faith.harakamall.ui.screens.service.ServiceScreen
import com.faith.harakamall.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            Homescreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)

        }
        composable(ROUT_START) {
            ItemScreen(navController)

        }
        composable(ROUT_INTENT) {
            ItemScreen(navController)

        }
        composable(ROUT_DASHBOARD) {
            DashbaordScreen(navController)

        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)

        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController)

        }
        composable(ROUT_SAMATHA) {
            SamathaScreen(navController)

        }


    }
}

@Composable
fun SamathaScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}