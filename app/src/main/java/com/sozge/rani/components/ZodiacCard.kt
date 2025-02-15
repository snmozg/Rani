package com.sozge.rani.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sozge.rani.R

@Composable
fun ZodiacCard(
    text: String,
    icon: Int = R.drawable.gemini
) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        onClick = { },
        modifier = Modifier
            .height(150.dp)
            .width(120.dp)
            .padding(end = 5.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.padding(5.dp),
                    painter = painterResource(id = icon),
                    contentDescription = text
                )
                CustomText(
                    text = text,
                    fontSize = 20.sp,
                )
            }
        }
    }
}