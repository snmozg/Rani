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
import com.sozge.rani.components.HoroscopeBottomSheetButton
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