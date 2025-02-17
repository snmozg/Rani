package com.sozge.rani.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextInput(
    label: String,
    text: String,
    onValueChange: (String) -> Unit,
    isSingleLine: Boolean,
    isVisual: Boolean,
    keyboardType: KeyboardType,
) {
    val isFocused by remember { mutableStateOf(false) }

    TextField(
        singleLine = isSingleLine,
        value = text,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        visualTransformation = if (!isVisual) PasswordVisualTransformation() else VisualTransformation.None,
        keyboardOptions = KeyboardOptions(keyboardType = keyboardType),

        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .border(
                1.dp,
                MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(20.dp)
            )
            .clip(RoundedCornerShape(20.dp)),

        colors = TextFieldDefaults.textFieldColors(
            containerColor = MaterialTheme.colorScheme.background,
            focusedIndicatorColor = MaterialTheme.colorScheme.primary,
            unfocusedIndicatorColor = Color.White,
            cursorColor = MaterialTheme.colorScheme.primary,
            focusedLabelColor =
            if (isFocused) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onBackground,
            unfocusedLabelColor = MaterialTheme.colorScheme.onBackground,
        ),
    )
}