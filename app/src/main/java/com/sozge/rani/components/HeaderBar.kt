package com.sozge.rani.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HeaderBar(
    isHomeScreen: Boolean = false,
    isEnableBackButton: Boolean = true,
    title: String = "Rani",
    navController: NavController,
) {
    val interactionSource = remember { MutableInteractionSource() }

    val dateFormat = remember { SimpleDateFormat("dd MMMM yyyy", Locale.getDefault()) }
    val currentDate = remember { mutableStateOf(dateFormat.format(Date())) }


    TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.background,
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
                            text = currentDate.value,
                            color = Color.LightGray,
                            fontSize = 12.sp
                        )
                        CustomText(
                            text = "Rani'ye Hoş Geldiniz!",
                            color = MaterialTheme.colorScheme.onBackground,
                            fontSize = 18.sp
                        )
                    }
                }
            } else {
                CustomText(
                    text = title,
                    color = MaterialTheme.colorScheme.onBackground,
                    fontSize = 24.sp,
                )
            }
        },

        navigationIcon = {
            if (isEnableBackButton) {
                IconButton(
                    onClick = {
                        navController.popBackStack()
                    },
                ) {
                    Icon(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(3.dp),
                        imageVector = Icons.Outlined.KeyboardArrowLeft,
                        contentDescription = "Back Button",
                        tint = MaterialTheme.colorScheme.primary
                    )
                }
            }
        },
        actions = {
            IconButton(
                onClick = {
                },
            ) {
                Icon(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(3.dp)
                        .clickable(
                            interactionSource = interactionSource,
                            indication = null
                        ) {
                            navController.navigate("UserInfoPage")
                        },
                    painter = painterResource(id = R.drawable.userinfos),
                    contentDescription = "User Infos Button",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    )
}