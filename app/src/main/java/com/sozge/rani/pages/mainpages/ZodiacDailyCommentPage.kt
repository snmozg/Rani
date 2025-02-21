package com.sozge.rani.pages.mainpages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.HoroscopeBottomSheetContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZodiacDailyCommentPage(navController: NavController) {
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = false)
    var showSheet by remember { mutableStateOf(true) }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(
                title = "Temel Bilgiler",
                navController = navController
            )
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (showSheet) {
                ModalBottomSheet(
                    onDismissRequest = { showSheet = false },
                    sheetState = sheetState,
                    containerColor = MaterialTheme.colorScheme.tertiary
                ) {
                    HoroscopeBottomSheetContent(
                        isClickablePage = false,
                        colorfulPageText = "Burç yorumlarını görmek için lütfen bekleyiniz..",
                        title = "İkizler Burcu",
                        dateRange = "21 Mayıs - 20 Haziran",
                        description = "Koç burcu, enerjik, girişimci ve lider ruhlu özellikleriyle bilinir. Kısa ve öz bir açıklama metni.",
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(MaterialTheme.colorScheme.background),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = painterResource(id = R.drawable.gemini), contentDescription = "")
            }

        }
    }
}