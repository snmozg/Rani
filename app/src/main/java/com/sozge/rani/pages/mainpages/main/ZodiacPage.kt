package com.sozge.rani.pages.mainpages.main


import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.FloatingBottomNavBar
import com.sozge.rani.components.HeaderBar

@Composable
fun ZodiacPage(navController: NavController) {
    val horoscopes = listOf("Koç", "Boğa", "İkizler", "Yengeç", "Aslan", "Başak", "Terazi", "Akrep", "Yay", "Oğlak", "Kova", "Balık")
    var selectedHoroscope by remember { mutableStateOf(1) }
    val scrollState = rememberScrollState()
    val categories = listOf("Genel Özellikler", "Günlük Burç", "Takım Yıldızları")
    val cardScrollState = rememberScrollState()
    var selectedCardIndex by remember { mutableStateOf(1) }

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
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .horizontalScroll(scrollState),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                horoscopes.forEachIndexed { index, name ->
                    val scale by animateFloatAsState(if (index == selectedHoroscope) 1.4f else 0.7f)
                    val zodiacIcon = when (name) {
                        "Koç" -> painterResource(id = R.drawable.aries)
                        "Boğa" -> painterResource(id = R.drawable.taurus)
                        "İkizler" -> painterResource(id = R.drawable.gemini)
                        "Yengeç" -> painterResource(id = R.drawable.cancer)
                        "Aslan" -> painterResource(id = R.drawable.leo)
                        "Başak" -> painterResource(id = R.drawable.virgo)
                        "Terazi" -> painterResource(id = R.drawable.libra)
                        "Akrep" -> painterResource(id = R.drawable.scorpio)
                        "Yay" -> painterResource(id = R.drawable.sagittarius)
                        "Oğlak" -> painterResource(id = R.drawable.capricorn)
                        "Kova" -> painterResource(id = R.drawable.aquarius)
                        "Balık" -> painterResource(id = R.drawable.pisces)
                        else -> painterResource(id = R.drawable.categorybackground)
                    }

                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .size(96.dp)
                                .scale(scale)
                                .background(
                                    if (index == selectedHoroscope) MaterialTheme.colorScheme.primary
                                    else MaterialTheme.colorScheme.background,
                                    shape = CircleShape
                                )
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
                                Button(onClick = { navController.navigate("ZodiacDailyCommentPage")}) {
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



