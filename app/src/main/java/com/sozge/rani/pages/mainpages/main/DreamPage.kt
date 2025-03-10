package com.sozge.rani.pages.mainpages.main

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.DreamCard
import com.sozge.rani.components.FloatingBottomNavBar
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.InterpretationCard

@Composable
fun DreamPage(navController: NavController) {
    var selectedTab by remember { mutableStateOf("Tabirler") }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                title = "Rüya Tabirleri",
                isEnableBackButton = false,
                navController = navController
            )
        },
        bottomBar = {
            FloatingBottomNavBar(
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it },
                navController
            )
        }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomText(text ="Rüyanı Nasıl Yorumlayalım?")

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    DreamCard(
                        title = "Anlat!",
                        description = "Kendi rüyalarınızı anlatarak yorumlatın",
                        image = R.drawable.purplebackground,
                        isHorizontalCard = false
                    ){
                        navController.navigate("ExplainPage")
                    }
                    DreamCard(
                        title = "Seç!",
                        description = "Önceden belirlediğimiz kategoriler ile yap!",
                        image = R.drawable.mavi1,
                        isHorizontalCard = false
                    ){
                        navController.navigate("CategoryPage")
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ){
                CustomText(text ="Rüya Tabirlerim")

                LazyColumn {
                    items(1){
                        InterpretationCard()
                        InterpretationCard()
                        InterpretationCard()
                        InterpretationCard()
                        InterpretationCard()
                    }
                }
            }
        }
    }
}