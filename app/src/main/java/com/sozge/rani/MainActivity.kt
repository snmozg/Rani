package com.sozge.rani

import android.os.Build
import android.os.Bundle
import android.view.View
import android.view.WindowInsets
import android.view.WindowInsetsController
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.DreamCard
import com.sozge.rani.ui.theme.RaniTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        hideNavigationBar()

        setContent {
            RaniTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    private fun hideNavigationBar() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.apply {
                hide(WindowInsets.Type.navigationBars())
                systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        } else {
            @Suppress("DEPRECATION")
            window.decorView.systemUiVisibility = (
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or
                            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                    )
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var selectedTab by remember { mutableStateOf("Home") }
    Column(
        Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomText(text = "Rüya Yorumla")
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
                    image = R.drawable.orangebackground,
                    isHorizontalCard = true,
                )
            }
        }
        CustomText(text = "Rüya Yorumla")
        LazyRow {
            items(1) {
                DreamCard(
                    title = "Anlat!",
                    description = "Kendi rüyalarınızı anlatarak yorumlatın",
                    image = R.drawable.purplebackground,
                    isHorizontalCard = false
                )
                DreamCard(
                    title = "Seç!",
                    description = "Önceden belirlediğimiz kategoriler ile yap!",
                    image = R.drawable.orangebackground,
                    isHorizontalCard = false
                )
            }
        }
        FloatingBottomNavBar(selectedTab = selectedTab, onTabSelected = { selectedTab = it })
    }
}


@Composable
fun FloatingBottomNavBar(
    selectedTab: String,
    onTabSelected: (String) -> Unit,
) {
    val tabs = listOf(
        "Home" to R.drawable.home,
        "Dream" to R.drawable.dream,
        "Zodiac" to R.drawable.planet,
        "Spa" to R.drawable.spa,
    )

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp)
            .height(90.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Black)
            .shadow(10.dp, shape = RoundedCornerShape(30.dp)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            tabs.forEach { (title, icon) ->
                val isSelected = selectedTab == title
                val animatedSize by animateFloatAsState(
                    targetValue = if (isSelected) 32f else 24f, label = ""
                )
                val animatedAlpha by animateFloatAsState(
                    targetValue = if (isSelected) 0f else 1f, label = ""
                )
                val animatedPadding by animateDpAsState(
                    targetValue = if (isSelected) 0.dp else 4.dp, label = ""
                )

                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .clickable { onTabSelected(title) }
                        .padding(top = animatedPadding)
                ) {
                    Icon(
                        painter = painterResource(id = icon),
                        contentDescription = title,
                        modifier = Modifier.size(animatedSize.dp),
                        tint = if (isSelected) Color.Magenta else Color.White
                    )
                    AnimatedVisibility(visible = !isSelected) {
                        Text(
                            text = title,
                            fontSize = 12.sp,
                            color = Color.White,
                            modifier = Modifier.alpha(animatedAlpha)
                        )
                    }
                }
            }
        }
    }
}

