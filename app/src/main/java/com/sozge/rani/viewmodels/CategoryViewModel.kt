package com.sozge.rani.viewmodels

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.sozge.rani.datas.CategoryCard

class CategoryViewModel : ViewModel() {
    private val _selectedMood = mutableStateListOf<CategoryCard>()
    val selectedMood : List<CategoryCard> get() = _selectedMood

    private val _selectedAnimal = mutableStateListOf<CategoryCard>()
    val selectedAnimal : List<CategoryCard> get() = _selectedAnimal

    private val _selectedColor = mutableStateListOf<CategoryCard>()
    val selectedColor : List<CategoryCard> get() = _selectedColor

    fun selectMood(category: CategoryCard) {
        if(_selectedMood.contains(category)) {
            _selectedMood.remove(category)
        } else if(_selectedMood.size < 3) {
            _selectedMood.add(category)
        }
    }

    fun selectAnimal(category: CategoryCard) {
        if(_selectedAnimal.contains(category)) {
            _selectedAnimal.remove(category)
        } else if(_selectedAnimal.size < 3) {
            _selectedAnimal.add(category)
        }
    }

    fun selectColor(category: CategoryCard) {
        if(_selectedColor.contains(category)) {
            _selectedColor.remove(category)
        } else if(_selectedColor.size < 3) {
            _selectedColor.add(category)
        }
    }
}