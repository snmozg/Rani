package com.sozge.rani.pages.mainpages.main

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.FloatingBottomNavBar
import com.sozge.rani.components.HeaderBar

@Composable
fun ZodiacPage(navController: NavController) {
    var selectedTab by remember { mutableStateOf("Burçlar") }
    val horoscopes = listOf(
        "Koç",
        "Boğa",
        "İkizler",
        "Yengeç",
        "Aslan",
        "Başak",
        "Terazi",
        "Akrep",
        "Yay",
        "Oğlak",
        "Kova",
        "Balık"
    )
    var selectedHoroscope by remember { mutableIntStateOf(1) }
    val scrollState = rememberScrollState()
    val categories = listOf("Genel Özellikler", "Günlük Burç", "Takım Yıldızları")
    val listState = rememberLazyListState()
    val cardScrollState = rememberScrollState()
    var selectedCardIndex by remember { mutableIntStateOf(1) }

    LaunchedEffect(cardScrollState.value) {
        val index = (cardScrollState.value / 220).coerceIn(0, categories.size - 1)
        selectedCardIndex = index
    }
    LaunchedEffect(scrollState.value) {
        val index = (scrollState.value / 100).coerceIn(0, horoscopes.size - 1)
        selectedHoroscope = index
    }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        topBar = {
            HeaderBar(
                title = "Burçlar",
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
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyRow(
                state = listState,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                itemsIndexed(horoscopes) { index, name ->
                    val scale by animateFloatAsState(if (index == selectedHoroscope) 1.2f else 0.5f)
                    val zodiacIcon = when (name) {
                        "Koç" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfularies) else painterResource(
                            id = R.drawable.whitearies
                        )

                        "Boğa" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfultaurus) else painterResource(
                            id = R.drawable.whitetaurus
                        )

                        "İkizler" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulgemini) else painterResource(
                            id = R.drawable.whitegemini
                        )

                        "Yengeç" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulcancer) else painterResource(
                            id = R.drawable.whitecancer
                        )

                        "Aslan" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulleo) else painterResource(
                            id = R.drawable.whiteleo
                        )

                        "Başak" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulvirgo) else painterResource(
                            id = R.drawable.whitevirgo
                        )

                        "Terazi" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfullibra) else painterResource(
                            id = R.drawable.whitelibra
                        )

                        "Akrep" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulscorpio) else painterResource(
                            id = R.drawable.whitescorpio
                        )

                        "Yay" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulsagittarius) else painterResource(
                            id = R.drawable.whitesagittarius
                        )

                        "Oğlak" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulcapricorn) else painterResource(
                            id = R.drawable.whitecapricorn
                        )

                        "Kova" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulaquarius) else painterResource(
                            id = R.drawable.whiteaquarius
                        )

                        "Balık" -> if (index == selectedHoroscope) painterResource(id = R.drawable.colorfulpisces) else painterResource(
                            id = R.drawable.whitepisces
                        )

                        else -> painterResource(id = R.drawable.categorybackground)
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier
                            .padding(horizontal = 10.dp)
                            .clickable(
                                indication = null,
                                interactionSource = remember { MutableInteractionSource() }
                            ) { selectedHoroscope = index }
                    ) {
                        Box(
                            modifier = Modifier
                                .size(96.dp)
                                .scale(scale)
                                .padding(8.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Icon(
                                painter = zodiacIcon,
                                contentDescription = "$name burcu",
                                tint = Color.Unspecified,
                                modifier = Modifier.fillMaxSize()
                            )
                        }
                        CustomText(name, fontSize = 20.sp, color = Color.White)
                    }
                }
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .horizontalScroll(cardScrollState)
                ) {
                    categories.forEachIndexed { index, category ->
                        val scale by animateFloatAsState(if (index == selectedCardIndex) 1f else 0.9f)
                        Card(
                            shape = RoundedCornerShape(20.dp),
                            modifier = Modifier
                                .width(340.dp)
                                .height(520.dp)
                                .padding(8.dp)
                        ) {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                verticalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text(category, fontSize = 16.sp, fontWeight = FontWeight.Bold)
                                Button(onClick = {
                                    val selectedHoroscopeName = horoscopes[selectedHoroscope]
                                    val route = when (selectedCardIndex) {
                                        0 -> "ZodiacInfoPage/$selectedHoroscopeName"
                                        1 -> "ZodiacDailyCommentPage"
                                        2 -> "ZodiacConstellationsPage/$selectedHoroscopeName"
                                        else -> "HomePage"
                                    }
                                    navController.navigate(route)
                                }) {
                                    Text("Devamını Oku")
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}