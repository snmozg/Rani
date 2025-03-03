package com.sozge.rani.pages.mainpages.main

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.DreamCard
import com.sozge.rani.components.FloatingBottomNavBar
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.ZodiacCard
import com.sozge.rani.components.manifestList

@Composable
fun HomePage(navController: NavController) {
    var selectedTab by remember { mutableStateOf("Ana Sayfa") }
    val interactionSource = remember { MutableInteractionSource() }
    var randomSentence by remember { mutableStateOf("") }
    LaunchedEffect(Unit) {
        randomSentence = manifestList.random()
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                isHomeScreen = true,
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
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.SpaceEvenly,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomText(text = "Günün Manifesti")

                OutlinedCard(
                    elevation = CardDefaults.cardElevation(defaultElevation = 9.dp),
                    onClick = { },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp),
                    border = BorderStroke(0.2.dp, MaterialTheme.colorScheme.primary)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.horizontalGradient(
                                    colors = listOf(
                                        Color(0xFF4c0078),
                                        Color(0xFF6A46AA),

                                    )
                                            //Color(0xFF2D086D), Color(0xFF6A46AA),
                                )
                            ).clickable(
                                interactionSource = interactionSource,
                                indication = null
                            ){}
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            CustomText(
                                text = randomSentence,
                                fontSize = 18.sp,
                                textAlign = TextAlign.Center,
                                fontWeight = FontWeight.Normal,
                                color = MaterialTheme.colorScheme.onBackground
                            )
                        }
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomText(text = "Rüyanı Yorumlayalım!")

                LazyRow {
                    items(1) {
                        DreamCard(
                            title = "Anlatarak Yorumlat",
                            description = "Kendi rüyalarınızı anlatarak yorumlatın",
                            image = R.drawable.purplebackground,
                            isHorizontalCard = true,
                        ){
                            navController.navigate("ExplainPage")
                        }
                        DreamCard(
                            title = "Seçerek Yorumlat",
                            description = "Önceden belirlediğimiz kategoriler ile yap!",
                            image = R.drawable.mavi1,
                            isHorizontalCard = true,
                        ){
                            navController.navigate("CategoryPage")
                        }
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomText(text = "Burçlar")

                LazyRow {
                    items(1) {
                        ZodiacCard("Koç", R.drawable.colorfularies)
                        ZodiacCard("Boğa", R.drawable.colorfultaurus)
                        ZodiacCard("İkizler", R.drawable.colorfulgemini)
                        ZodiacCard("Yengeç", R.drawable.colorfulcancer)
                        ZodiacCard("Aslan", R.drawable.colorfulleo)
                        ZodiacCard("Başak", R.drawable.colorfulvirgo)
                        ZodiacCard("Terazi", R.drawable.colorfullibra)
                        ZodiacCard("Akrep", R.drawable.colorfulscorpio)
                        ZodiacCard("Yay", R.drawable.colorfulsagittarius)
                        ZodiacCard("Oğlak", R.drawable.colorfulcapricorn)
                        ZodiacCard("Kova", R.drawable.colorfulaquarius)
                        ZodiacCard("Balık", R.drawable.colorfulpisces)
                    }
                }
            }
        }
    }
}