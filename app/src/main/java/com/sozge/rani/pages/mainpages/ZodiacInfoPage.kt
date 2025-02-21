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
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.HeaderBar
import com.sozge.rani.components.HoroscopeBottomSheetContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ZodiacInfoPage(navController: NavController) {
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
                        title = "İkizler Burcu",
                        dateRange = "21 Mayıs - 20 Haziran",
                        description = "Koç burcu, enerjik, girişimci ve lider ruhlu özellikleriyle bilinir. Kısa ve öz bir açıklama metni.",
                        firstButtonText = "Genel",
                        firstButtonContent = "Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin... Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin..",
                        secondButtonText = "Erkek",
                        secondButtonContent = "Erkek burç yorumu: Koç burcunun erkeklerine özgü özellikleri, günlük enerjileri ve yaşam felsefesini anlatan uzun metin...",
                        thirdButtonText = "Kadın",
                        thirdButtonContent = "Kadın burç yorumu: Koç burcunun kadınlarına özgü özellikleri, günlük enerjileri ve yaşam felsefesini anlatan uzun metin...",
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