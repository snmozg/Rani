package com.sozge.rani.pages.mainpages

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.components.FloatingBottomNavBar
import com.sozge.rani.components.HeaderBar

@Composable
fun ZodiacPage(navController: NavController) {
    var selectedTab by remember { mutableStateOf("Burçlar") }
    val burclar = listOf(
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
    val pagerState = rememberPagerState(pageCount = { burclar.size }, initialPage = 2)

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                title = "Burçlar"
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
                .fillMaxSize()
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            BurcSelector(pagerState, burclar)
            BurcCardPager(pagerState.currentPage)
        }
    }
}

@Composable
fun BurcSelector(pagerState: PagerState, burclar: List<String>) {
    HorizontalPager(state = pagerState, modifier = Modifier.height(120.dp)) { page ->
        val isSelected = pagerState.currentPage == page
        val scale by animateFloatAsState(if (isSelected) 1.4f else 0.9f, label = "Scale")
        val alpha by animateFloatAsState(if (isSelected) 1f else 0.5f, label = "Alpha")

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .scale(scale)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .background(
                            if (isSelected) Color.White else Color.Gray,
                            shape = RoundedCornerShape(30.dp)
                        )
                )
                Text(
                    text = burclar[page],
                    fontSize = 18.sp,
                    color = if (isSelected) Color.White else Color.Gray
                )
            }
        }
    }
}

@Composable
fun BurcCardPager(selectedBurcIndex: Int) {
    val cardTitles = listOf("Genel Özellikler", "Günlük Yorum", "Yıldız Haritası")
    val pagerState = rememberPagerState(pageCount = { cardTitles.size }, initialPage = 1)

    HorizontalPager(state = pagerState, modifier = Modifier.fillMaxHeight()) { page ->
        val isSelected = pagerState.currentPage == page
        val scale by animateFloatAsState(if (isSelected) 1f else 0.85f, label = "Scale")
        val alpha by animateFloatAsState(if (isSelected) 1f else 0.6f, label = "Alpha")

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(800.dp)
                .scale(scale)
                .alpha(alpha)
                .clip(RoundedCornerShape(20.dp))
                .background(Color.Blue.copy(alpha = 0.5f))
                .padding(16.dp),
            contentAlignment = Alignment.BottomCenter
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(text = cardTitles[page], fontSize = 22.sp, color = Color.White)
                Text(
                    text = "Burcun özel bilgileri burada yer alacak...",
                    fontSize = 16.sp,
                    color = Color.White
                )
                Button(onClick = { /* Detay sayfasına git */ }) {
                    Text("Detaylıca Oku")
                }
            }
        }
    }

}