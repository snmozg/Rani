package com.sozge.rani.pages.mainpages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sozge.rani.R
import com.sozge.rani.components.CustomText
import com.sozge.rani.components.HeaderBar

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
                    HoroscopeBottomSheetContent()
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

@Composable
fun HoroscopeBottomSheetContent() {
    var selectedTab by remember { mutableStateOf("Genel") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CustomText(text = "Koç Burcu", fontSize = 24.sp)

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.Schedule,
                    contentDescription = "Tarih aralığı",
                    modifier = Modifier.size(16.dp)
                )
                CustomText(text = "21 Mart - 19 Nisan", fontSize = 14.sp)
            }

            CustomText(
                text = "Koç burcu, enerjik, girişimci ve lider ruhlu özellikleriyle bilinir. Kısa ve öz bir açıklama metni.",
                fontSize = 16.sp
            )
        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            HoroscopeButton(
                text = "Genel",
                isSelected = selectedTab == "Genel",
                onClick = { selectedTab = "Genel" }
            )
            HoroscopeButton(
                text = "Erkek",
                isSelected = selectedTab == "Erkek",
                onClick = { selectedTab = "Erkek" }
            )
            HoroscopeButton(
                text = "Kadın",
                isSelected = selectedTab == "Kadın",
                onClick = { selectedTab = "Kadın" }
            )
        }

        when (selectedTab) {
            "Genel" -> {
                CustomText(
                    text = "Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin... Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin..",
                    fontSize = 16.sp
                )
            }

            "Erkek" -> {
                CustomText(
                    text = "Erkeklere özel burç yorumu: Koç erkeklerinin karakteristik özellikleri, ilişkilerdeki yaklaşımları ve günlük enerjileri...",
                    fontSize = 16.sp
                )
            }

            "Kadın" -> {
                CustomText(
                    text = "Kadınlara özel burç yorumu: Koç kadınlarının yaşam tarzı, duygusal yönleri ve ilişkilere bakış açılarını anlatan detaylı metin...",
                    fontSize = 16.sp
                )
            }
        }
    }
}

@Composable
fun HoroscopeButton(
    text: String,
    isSelected: Boolean,
    onClick: () -> Unit,
) {
    OutlinedButton(
        modifier = Modifier
            .height(60.dp)
            .width(125.dp),
        onClick = onClick,
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = if (isSelected) MaterialTheme.colorScheme.primary else Color.Transparent,
            contentColor = Color.White
        ),
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            CustomText(text = text, fontSize = 20.sp)
        }
    }
}