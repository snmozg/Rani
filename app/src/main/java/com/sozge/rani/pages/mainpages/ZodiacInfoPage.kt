package com.sozge.rani.pages.mainpages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.HoroscopeBottomSheetContent
import com.sozge.rani.datas.HoroscopeRepository

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZodiacInfoPage(navController: NavController, horoscopeName: String) {
    val horoscope = HoroscopeRepository.getHoroscope(horoscopeName)

    if (horoscope == null) {
        Text(text = "Burç bilgisi bulunamadı", color = Color.Red, fontSize = 20.sp)
        return
    }

    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = false)
    var showSheet by remember { mutableStateOf(true) }

    Scaffold(
        modifier = Modifier.fillMaxSize().background(Color.White),
        topBar = {
            HeaderBar(title = "${horoscope.name} Burcu", navController = navController)
        },
    ) { innerPadding ->
        Column(
            modifier = Modifier.fillMaxSize().padding(innerPadding),
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
                        title = horoscope.name,
                        dateRange = horoscope.dateRange,
                        description = horoscope.description,
                        firstButtonText = "Genel",
                        firstButtonContent = horoscope.general,
                        secondButtonText = "Erkek",
                        secondButtonContent = horoscope.male,
                        thirdButtonText = "Kadın",
                        thirdButtonContent = horoscope.female,
                    )
                }
            }
            Box(
                modifier = Modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.gemini),
                    contentDescription = ""
                )
            }
        }
    }
}