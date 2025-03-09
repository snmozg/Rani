package com.sozge.rani.pages.mainpages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.FabPosition
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavController
import com.sozge.rani.components.CustomDropdownMenu
import com.sozge.rani.components.CustomTextInput
import com.sozge.rani.components.ExpandedButton
import com.sozge.rani.components.HeaderBar

@Composable
fun UserInfoPage(navController: NavController) {
    var name by remember { mutableStateOf("") }
    var age by remember { mutableStateOf("") }
    var gender by remember { mutableStateOf("") }

    val optionsGender = listOf("Hiçbiri", "Erkek", "Kadın")
    val scrollState = rememberScrollState()

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            HeaderBar(
                title = "Kullanıcı Bilgileri",
                navController = navController
            )
        },
        floatingActionButton = {
            ExpandedButton(text = "Kaydet") {
                println(name + "\n" + age + "\n" + gender)
            }
        },
        floatingActionButtonPosition = FabPosition.Center
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .imePadding()
                .verticalScroll(scrollState)
                .padding(innerPadding)
                .background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                CustomDropdownMenu(
                    label = "Cinsiyet",
                    options = optionsGender,
                    selectedOption = gender,
                    onOptionSelected = { gender = it }
                )

                CustomTextInput(
                    label = "Ad Soyad",
                    text = name,
                    onValueChange = { name = it },
                    isSingleLine = true,
                    isVisual = true,
                    keyboardType = KeyboardType.Text
                )

                CustomTextInput(
                    label = "Yaş",
                    text = age,
                    onValueChange = { age = it },
                    isSingleLine = true,
                    isVisual = true,
                    keyboardType = KeyboardType.Number
                )

            }
        }
    }
}