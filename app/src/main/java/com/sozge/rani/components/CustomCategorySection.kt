package com.sozge.rani.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.sozge.rani.datas.CategoryCard

@Composable
fun CustomCategorySection(
    list: List<CategoryCard>,
    isMultiple: Boolean,
    selectedList: List<CategoryCard>,
    onSelectionChange: (CategoryCard) -> Unit
) {
    Box(
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            itemsIndexed(list) { index, item ->
                val isSelected = selectedList.contains(item)
                CategoryCardItem(
                    index = index,
                    item = item,
                    isSelected = isSelected,
                    cardWidth = 100.dp,
                    cardHeight = 100.dp,
                    onClick = {
                        onSelectionChange(item)
                    }
                )
            }
        }
    }
}