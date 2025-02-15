package com.sozge.rani.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.DreamCard
import com.sozge.rani.components.FloatingBottomNavBar
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.InterpretationCard

@Composable
fun DreamPage() {
    var selectedTab by remember { mutableStateOf("Dream") }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                title = "Rüya Tabirleri"
            )
        },
        bottomBar = {
            FloatingBottomNavBar(
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it }
            )
        }
    ){ innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(Color.White),
            verticalArrangement = Arrangement.SpaceBetween,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                CustomText(text ="Rüyanı Nasıl Yorumlamamızı İstersin?")

                LazyRow {
                    items(1){
                        DreamCard(
                            title = "Anlat!",
                            description = "Kendi rüyalarınızı anlatarak yorumlatın",
                            image = R.drawable.purplebackground,
                            isHorizontalCard = false
                        )
                        DreamCard(
                            title = "Seç!",
                            description = "Önceden belirlediğimiz kategoriler ile yap!",
                            image = R.drawable.darkbluebackground,
                            isHorizontalCard = false
                        )
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.Center
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

@Preview
@Composable
fun DreamPagePreview() {
    DreamPage()
}