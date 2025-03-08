package com.sozge.rani.pages.mainpages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.components.CustomCategorySection
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.ExpandedButton
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.lists.animalList
import com.sozge.rani.lists.colorList
import com.sozge.rani.lists.familyList
import com.sozge.rani.lists.moodList
import com.sozge.rani.lists.weatherList
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
        floatingActionButton = {
            ExpandedButton(text = "Rüyanı Yorumla!") {
                println("Rüya yorumla butonuna basıldı")
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
            ) {
                items(1) {
                    CustomText(text = "Ruh Hali, Nasıl Uyandın?", fontSize = 22.sp)

                    CustomCategorySection(
                        list = moodList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectMood(category)
                        },
                        selectedList = categoryViewModel.selectedMood
                    )
                    CustomText(text = "Hayvan, Rüyanda hayvan var mıydı?", fontSize = 22.sp)

                    CustomCategorySection(
                        list = animalList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectAnimal(category)
                        },
                        selectedList = categoryViewModel.selectedAnimal
                    )
                    CustomText(text = "Renk, Bir renk ön planda mıydı?", fontSize = 22.sp)

                    CustomCategorySection(
                        list = colorList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectColor(category)
                        },
                        selectedList = categoryViewModel.selectedColor
                    )
                    CustomText(text = "Hava durumu Nasıldı?", fontSize = 22.sp)
                    CustomCategorySection(
                        list = weatherList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectWeather(category)
                        },
                        selectedList = categoryViewModel.selectedWeather
                    )
                    CustomText(text = "Kişi, Kimler vardı?", fontSize = 22.sp)

                    CustomCategorySection(
                        list = familyList(),
                        true,
                        onSelectionChange = { category ->
                            categoryViewModel.selectFamily(category)
                        },
                        selectedList = categoryViewModel.selectedColor
                    )

                    Spacer(modifier = Modifier.padding(50.dp))

                    Row(
                        modifier = Modifier.fillParentMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Text(text = "")
                    }
                }
            }
        }
    }
}