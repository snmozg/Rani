package com.sozge.rani.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.sozge.rani.utils.myFont

@Composable
fun CustomText(
    text: String,
    fontSize: TextUnit = 32.sp,
    fontWeight: FontWeight = FontWeight.Bold,
    color: Color = Color.White,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text = text,
        fontSize = fontSize,
        color = color,
        fontFamily = myFont,
        fontWeight = fontWeight,
        textAlign = textAlign
    )
}