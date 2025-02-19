package com.sozge.rani.pages.mainpages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.components.CustomCategorySection
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.ExpandedButton
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.lists.animalList
import com.sozge.rani.lists.colorList
import com.sozge.rani.lists.moodList
import com.sozge.rani.viewmodels.CategoryViewModel

@Composable
fun CategoryPage(
    navController: NavController,
    categoryViewModel: CategoryViewModel,
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                title = "Rüyanı Tanımla",
                navController = navController
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    CustomText(text = "Ruh Hali, Nasıl Uyandın?", fontSize = 22.sp)

                    CustomCategorySection(
                        list = moodList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectMood(category)
                        },
                        selectedList = categoryViewModel.selectedMood
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    CustomText(text = "Hayvan, Rüyanda hayvan var mıydı?", fontSize = 22.sp)

                    CustomCategorySection(
                        list = animalList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectAnimal(category)
                        },
                        selectedList = categoryViewModel.selectedAnimal
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp)
                ) {
                    CustomText(text = "Renk, bir renk ön planda mıydı?", fontSize = 22.sp)

                    CustomCategorySection(
                        list = colorList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectColor(category)
                        },
                        selectedList = categoryViewModel.selectedColor
                    )
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ExpandedButton(
                    text = "Rüyanı Yorumla!",
                ) {
                    println("Rüya yorumla butonuna basıldı")
                }
            }
        }
    }
}