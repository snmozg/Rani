package com.sozge.rani.lists

import androidx.compose.runtime.Composable
import com.sozge.rani.R
import com.sozge.rani.datas.CategoryCard

@Composable
fun moodList(): List<CategoryCard> {
    return listOf(
        CategoryCard(
            image = R.drawable.moodnone,
            text = "Belirsiz"
        ),
        CategoryCard(
            image = R.drawable.moodhappy,
            text = "Mutlu"
        ),
        CategoryCard(
            image = R.drawable.moodscared,
            text = "Korkmuş"
        ),
        CategoryCard(
            image = R.drawable.moodpeacful,
            text = "Huzurlu"
        ),
        CategoryCard(
            image = R.drawable.moodcurious,
            text = "Meraklı"
        ),
        CategoryCard(
            image = R.drawable.moodangry,
            text = "Sinirli"
        ),
        CategoryCard(
            image = R.drawable.moodshocked,
            text = "Şaşırmış"
        ),
        CategoryCard(
            image = R.drawable.moodsad,
            text = "Üzgün"
        ),
    )
}

@Composable
fun animalList(): List<CategoryCard>{
    return listOf(
        CategoryCard(
            image = R.drawable.dog1,
            text = "Köpek"
        ),
        CategoryCard(
            image = R.drawable.bird1,
            text = "Kuş"
        ),
        CategoryCard(
            image = R.drawable.cat1,
            text = "Kedi"
        ),
        CategoryCard(
            image = R.drawable.turtle1,
            text = "Kaplumbağa"
        ),
        CategoryCard(
            image = R.drawable.fish1,
            text = "Balık"
        ),
        CategoryCard(
            image = R.drawable.snake1,
            text = "Yılan"
        ),
        CategoryCard(
            image = R.drawable.horse1,
            text = "At"
        ),
        CategoryCard(
            image = R.drawable.mouse1,
            text = "Fare"
        ),
        CategoryCard(
            image = R.drawable.squirrel1,
            text = "Sincap"
        ),
        CategoryCard(
            image = R.drawable.bat1,
            text = "Yarasa"
        ),
        CategoryCard(
            image = R.drawable.wolf1,
            text = "Kurt"
        ),
        CategoryCard(
            image = R.drawable.shark1,
            text = "Köpekbalığı"
        ),

        CategoryCard(
            image = R.drawable.crow1,
            text = "Karga"
        )
    )
}

@Composable
fun colorList(): List<CategoryCard>{
    return listOf(
        CategoryCard(
            image = R.drawable.colorred,
            text = "Kırmızı"
        ),
        CategoryCard(
            image = R.drawable.colorblue,
            text = "Mavi"
        ),
        CategoryCard(
            image = R.drawable.colorgreen,
            text = "Yeşil"
        ),
        CategoryCard(
            image = R.drawable.coloryellow,
            text = "Sarı"
        ),
        CategoryCard(
            image = R.drawable.colorpurple,
            text = "Mor"
        ),
        CategoryCard(
            image = R.drawable.colorpink,
            text = "Pembe"
        ),
        CategoryCard(
            image = R.drawable.colororange,
            text = "Turuncu"
        ),
        CategoryCard(
            image = R.drawable.colorgray,
            text = "Gri"
        ),
        CategoryCard(
            image = R.drawable.colorbrown,
            text = "Kahverengi"
        ),
        CategoryCard(
            image = R.drawable.colorwhite,
            text = "Beyaz"
        ),
        CategoryCard(
            image = R.drawable.colorblack,
            text = "Siyah"
        )
    )
}

