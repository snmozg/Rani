package com.sozge.rani.components

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sozge.rani.R

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