package com.sozge.rani.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sozge.rani.pages.mainpages.DreamPage
import com.sozge.rani.pages.mainpages.ExplainPage
import com.sozge.rani.pages.mainpages.HomePage
import com.sozge.rani.pages.mainpages.ZodiacPage

@Composable
fun NavController() {
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "HomePage"
    ) {
        composable(route = "HomePage") { HomePage(navController) }
        composable(route = "DreamPage") { DreamPage(navController) }
        composable(route = "ZodiacPage") { ZodiacPage(navController) }
        composable(route = "ExplainPage") { ExplainPage(navController) }
    }
}