package com.sozge.rani.pages.mainpages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.CustomTextInput
import com.sozge.rani.components.ExpandedButton
import com.sozge.rani.components.ExplainButton
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.HoroscopeBottomSheetButton

@Composable
fun ExplainPage(navController: NavController) {
    val message = remember { mutableStateOf("") }
    var selectedTab by remember { mutableStateOf("") }
    var selectedCharacterCode by remember { mutableStateOf("") }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                title = "Rüyanı Anlat",
                navController = navController
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomText(text = "Rüyanızın Gizemini Çözün!")
                CustomText(
                    text = "Rüyanızdaki olayları, dikkat çeken nesneleri, renkleri ve hisleri bizimle paylaşın.",
                    fontSize = 16.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomTextInput(
                    label = "Detaylıca Rüyandan Bahset...",
                    text = message.value,
                    onValueChange = { message.value = it },
                    isSingleLine = false,
                    isVisual = true,
                    keyboardType = KeyboardType.Text,
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                CustomText(
                    text = "Bilinçaltınızın rehberi kim olsun?",
                    fontSize = 20.sp
                )
                CustomText(
                    text = "Aşağıdan bir rüya tabircisi seçerek rüyanızı yorumlatın!",
                    fontSize = 16.sp
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    ExplainButton(
                        text = "Evliya",
                        icon = painterResource(id = R.drawable.grandpa),
                        isSelected = selectedTab == "First",
                        onClick = { selectedTab = "First" }
                    )
                    ExplainButton(
                        text = "Leyla",
                        icon = painterResource(id = R.drawable.grandma),
                        isSelected = selectedTab == "Second",
                        onClick = { selectedTab = "Second" }
                    )
                    ExplainButton(
                        text = "Agah",
                        icon = painterResource(id = R.drawable.dad),
                        isSelected = selectedTab == "Third",
                        onClick = { selectedTab = "Third" }
                    )
                }

                when (selectedTab) {
                    "First" -> {
                        selectedCharacterCode = "Evliya"
                    }

                    "Second" -> {
                        selectedCharacterCode = "Leyla"
                    }

                    "Third" -> {
                        selectedCharacterCode = "Agah"
                    }
                }
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                ExpandedButton(
                    text = "Rüyanı Yorumla!",
                ) {
                    println(selectedCharacterCode)
                }
            }
        }
    }
}