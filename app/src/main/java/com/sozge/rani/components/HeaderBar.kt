package com.sozge.rani.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sozge.rani.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderBar(
    isHomeScreen: Boolean = false,
    isEnableBackButton: Boolean = true,
    title: String = "Rani"
) {
    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = MaterialTheme.colorScheme.onBackground
        ),
        title = {
            if (isHomeScreen) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding()
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        horizontalAlignment = Alignment.Start,
                        verticalArrangement = Arrangement.Center
                    ) {
                        CustomText(
                            text = "27/05/2025",
                            color = Color.LightGray,
                            fontSize = 12.sp
                        )
                        CustomText(
                            text = "Rani'ye Hoş Geldiniz!",
                            color = Color.Black,
                            fontSize = 14.sp
                        )
                    }
                }
            } else {
                CustomText(text = title)
            }
        },

        navigationIcon = {
            if (isEnableBackButton) {
                IconButton(
                    onClick = {
                        println("Navigation Icon Clicked")
                    },
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(3.dp),
                        imageVector = Icons.Outlined.KeyboardArrowLeft,
                        contentDescription = "Menu Button",
                        tint = Color.Black
                    )
                }
            }
        },
        actions = {
            IconButton(
                onClick = {
                    println("User Infos Clicked")
                },
            ) {
                Icon(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(3.dp),
                    painter = painterResource(id = R.drawable.userinfos),
                    contentDescription = "User Infos Button",
                    tint = Color.Black
                )
            }
        }
    )
}

@Preview
@Composable
fun HeaderBarPreview() {
    HeaderBar()
}