package com.sozge.rani.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sozge.rani.R


@Composable
fun DreamCard(
    title: String,
    description: String,
    image: Int,
    isHorizontalCard: Boolean,
) {
    if (isHorizontalCard) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 9.dp),
            onClick = { },
            modifier = Modifier
                .height(160.dp)
                .width(300.dp)
                .padding(2.dp),
        ) {
            Box() {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
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
                        horizontalAlignment = Alignment.Start
                    ) {
                        CustomText(
                            text = title,
                            fontSize = 20.sp,
                        )
                        CustomText(
                            text = description,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Normal,
                        )
                    }
                }
            }
        }
    } else {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 9.dp),
            onClick = { },
            modifier = Modifier
                .height(250.dp)
                .width(200.dp)
                .padding(2.dp),
        ) {
            Box() {
                Image(
                    painter = painterResource(id = image),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize()
                )
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Bottom,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        CustomText(
                            text = title,
                            fontSize = 36.sp,
                            textAlign = TextAlign.Center
                        )
                        CustomText(
                            text = description,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            textAlign = TextAlign.Center
                        )
                    }
                }
            }
        }
    }
}