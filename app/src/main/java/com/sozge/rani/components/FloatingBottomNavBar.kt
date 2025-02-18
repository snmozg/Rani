package com.sozge.rani.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R

@Composable
fun FloatingBottomNavBar(
    selectedTab: String,
    onTabSelected: (String) -> Unit,
    navController: NavController
) {
    val tabs = listOf(
        "Ana Sayfa" to R.drawable.home,
        "Tabirler" to R.drawable.dream,
        "Burçlar" to R.drawable.planet,
        "Yükselen" to R.drawable.spa,
    )
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp, vertical = 16.dp)
            .height(90.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(MaterialTheme.colorScheme.tertiary)
            .shadow(10.dp, shape = RoundedCornerShape(30.dp)),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.tertiary),
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
                        .then(
                            if (!isSelected) {
                                Modifier.clickable(
                                    indication = null,
                                    interactionSource = remember { MutableInteractionSource() }
                                ) {
                                    onTabSelected(title)
                                    when (title) {
                                        "Ana Sayfa" -> navController.navigate("HomePage")
                                        "Tabirler" -> navController.navigate("DreamPage")
                                        "Burçlar" -> navController.navigate("ZodiacPage")
                                        "Yükselen" -> navController.navigate("RisingPage")
                                    }
                                }
                            } else Modifier
                        )
                        .padding(top = animatedPadding)
                ) {
                    Icon(
                        painter = painterResource(id = icon),
                        contentDescription = title,
                        modifier = Modifier.size(animatedSize.dp),
                        tint = if (isSelected) MaterialTheme.colorScheme.primary
                        else MaterialTheme.colorScheme.onBackground
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