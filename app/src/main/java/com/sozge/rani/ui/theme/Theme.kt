package com.sozge.rani.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = palatinateBlue,
    secondary = chinaRose,
    background = newBlack,
    onBackground = newWhite,
    tertiary = lightNewBlack
)

private val LightColorScheme = lightColorScheme(
    primary = palatinateBlue,
    secondary = chinaRose,
    background = newBlack,
    onBackground = newWhite,
    tertiary = lightNewBlack
)

@Composable
fun RaniTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }
    MaterialTheme(
        colorScheme = colors,
        typography = Typography,
        content = content
    )
}