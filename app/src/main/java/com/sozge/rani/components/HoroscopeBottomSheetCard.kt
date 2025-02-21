package com.sozge.rani.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sozge.rani.R

@Composable
fun HoroscopeBottomSheetCard(
    text: String,
    icon: Painter = painterResource(id = R.drawable.taurus),
    colorValue: Int = 1
) {
    OutlinedCard(
        modifier = Modifier
            .height(60.dp)
            .width(125.dp)
            .padding(2.dp),
        colors = CardDefaults.cardColors(
            containerColor =
            if (colorValue == 1) {
                Color(0xFF548F4A)
            } else if (colorValue == 2) {
                Color(0xFFBBB94F)
            } else
                Color(0xFF811616),
            contentColor = Color.White
        ),
        shape = RoundedCornerShape(20.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = icon,
                contentDescription = null,
                modifier = Modifier
                    .size(36.dp)
                    .padding(end = 4.dp)
            )
            CustomText(
                text = text,
                fontSize = 16.sp,
            )

        }

    }
}