package com.faith.harakamall.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.faith.harakamall.data.UserDatabase
import com.faith.harakamall.repository.UserRepository
import com.faith.harakamall.ui.screens.about.AboutScreen
import com.faith.harakamall.ui.screens.auth.LoginScreen
import com.faith.harakamall.ui.screens.auth.RegisterScreen
import com.faith.harakamall.ui.screens.dashboard.DashbaordScreen
import com.faith.harakamall.ui.screens.home.Homescreen
import com.faith.harakamall.ui.screens.item.ItemScreen
import com.faith.harakamall.ui.screens.service.ServiceScreen
import com.faith.harakamall.ui.screens.splash.SplashScreen
import com.faith.harakamall.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASH
) {
    val context= LocalContext.current

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
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }



    }
}

@Composable
fun SamathaScreen(x0: NavHostController) {
    TODO("Not yet implemented")
}