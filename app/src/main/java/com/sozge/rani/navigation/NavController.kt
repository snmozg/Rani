package com.sozge.rani.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sozge.rani.pages.mainpages.CategoryPage
import com.sozge.rani.pages.mainpages.main.DreamPage
import com.sozge.rani.pages.mainpages.ExplainPage
import com.sozge.rani.pages.mainpages.ZodiacInfoPage
import com.sozge.rani.pages.mainpages.main.HomePage
import com.sozge.rani.pages.mainpages.main.RisingPage
import com.sozge.rani.pages.mainpages.main.ZodiacPage
import com.sozge.rani.viewmodels.CategoryViewModel

@Composable
fun NavController() {
    val categoryViewModel = CategoryViewModel()
    val navController = rememberNavController()
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = "HomePage"
    ) {
        composable(route = "HomePage") { HomePage(navController) }
        composable(route = "DreamPage") { DreamPage(navController) }
        composable(route = "ZodiacPage") { ZodiacPage(navController) }

        composable(route = "ZodiacInfoPage") { ZodiacInfoPage(navController) }

        composable(route = "ExplainPage") { ExplainPage(navController) }
        composable(route = "RisingPage") { RisingPage(navController) }
        composable(route="CategoryPage") { CategoryPage(navController, categoryViewModel) }
    }
}