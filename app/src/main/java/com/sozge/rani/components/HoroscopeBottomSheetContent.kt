package com.sozge.rani.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Schedule
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HoroscopeBottomSheetContent(
) {
    var selectedTab by remember { mutableStateOf("First") }

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
            HoroscopeBottomSheetButton(
                text = "Erdem",
                isSelected = selectedTab == "First",
                onClick = { selectedTab = "First" }
            )
            HoroscopeBottomSheetButton(
                text = "Erkek",
                isSelected = selectedTab == "Second",
                onClick = { selectedTab = "Second" }
            )
            HoroscopeBottomSheetButton(
                text = "Kadın",
                isSelected = selectedTab == "Third",
                onClick = { selectedTab = "Third" }
            )
        }

        when (selectedTab) {
            "First" -> {
                CustomText(
                    text = "Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin... Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin.. Genel burç yorumu: Koç burcunun genel özelliklerini, günlük enerjilerini ve yaşam felsefesini anlatan uzun metin..",
                    fontSize = 16.sp
                )
            }

            "Second" -> {
                CustomText(
                    text = "Erkeklere özel burç yorumu: Koç erkeklerinin karakteristik özellikleri, ilişkilerdeki yaklaşımları ve günlük enerjileri...",
                    fontSize = 16.sp
                )
            }

            "Third" -> {
                CustomText(
                    text = "Kadınlara özel burç yorumu: Koç kadınlarının yaşam tarzı, duygusal yönleri ve ilişkilere bakış açılarını anlatan detaylı metin...",
                    fontSize = 16.sp
                )
            }
        }
    }
}