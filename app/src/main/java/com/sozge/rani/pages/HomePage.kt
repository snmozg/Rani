package com.sozge.rani.pages

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.DreamCard
import com.sozge.rani.components.FloatingBottomNavBar
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.ZodiacCard

@Composable
fun HomePage(navController: NavController) {
    var selectedTab by remember { mutableStateOf("Home") }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                isHomeScreen = true,
                isEnableBackButton = false
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
                                Brush.verticalGradient(
                                    colors = listOf(
                                        Color(0xFF991433),
                                        Color(0xFFB24C63),
                                        Color(0xFFB46073)
                                    )
                                )
                            )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            CustomText(
                                text = "Bugün için bir manifest oluştur",
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
                        )
                        DreamCard(
                            title = "Seçerek Yorumlat",
                            description = "Önceden belirlediğimiz kategoriler ile yap!",
                            image = R.drawable.darkbluebackground,
                            isHorizontalCard = true,
                        )
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
                        ZodiacCard("Koç", R.drawable.aries)
                        ZodiacCard("Boğa", R.drawable.taurus)
                        ZodiacCard("İkizler", R.drawable.gemini)
                        ZodiacCard("Yengeç", R.drawable.cancer)
                        ZodiacCard("Aslan", R.drawable.leo)
                        ZodiacCard("Başak", R.drawable.virgo)
                        ZodiacCard("Terazi", R.drawable.libra)
                        ZodiacCard("Akrep", R.drawable.scorpio)
                        ZodiacCard("Yay", R.drawable.sagittarius)
                        ZodiacCard("Oğlak", R.drawable.capricorn)
                        ZodiacCard("Kova", R.drawable.aquarius)
                        ZodiacCard("Balık", R.drawable.pisces)
                    }
                }
            }
        }
    }
}