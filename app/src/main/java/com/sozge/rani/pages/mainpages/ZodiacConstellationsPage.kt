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
import androidx.compose.material3.Text
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
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.HoroscopeBottomSheetContent
import com.sozge.rani.datas.ConstellationsRepository
import com.sozge.rani.datas.ConstellationsRepository.constellations
import com.sozge.rani.datas.HoroscopeRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZodiacConstellationsPage(navController: NavController,
                             horoscopeName: String
) {
    val constellations = ConstellationsRepository.getConstellations(horoscopeName)

    if (constellations == null) {
        Text(text = "Burç bilgisi bulunamadı", color = Color.Red, fontSize = 20.sp)
        return
    }
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = false)
    var showSheet by remember { mutableStateOf(true) }

    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        topBar = {
            HeaderBar(title = "${constellations.name} Burcu", navController = navController)
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
                        title = constellations.name,
                        dateRange = constellations.dateRange,
                        description = constellations.description,
                        firstButtonText = "Mitoloji",
                        firstButtonContent = constellations.mythology,
                        secondButtonText = "Yıldız Haritası",
                        secondButtonContent = constellations.starMap,
                        thirdButtonText = "Parlaklık",
                        thirdButtonContent = constellations.brightness,
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