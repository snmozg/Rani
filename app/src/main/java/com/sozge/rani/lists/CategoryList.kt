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
            image = R.drawable.animaldog,
            text = "Köpek"
        ),
        CategoryCard(
            image = R.drawable.animalbird,
            text = "Kuş"
        ),
        CategoryCard(
            image = R.drawable.animalcat,
            text = "Kedi"
        ),
        CategoryCard(
            image = R.drawable.animlaturtle,
            text = "Kaplumbağa"
        ),
        CategoryCard(
            image = R.drawable.animalfish,
            text = "Balık"
        ),
        CategoryCard(
            image = R.drawable.animalstork,
            text = "Leylek"
        ),
        CategoryCard(
            image = R.drawable.animalsnake,
            text = "Yılan"
        ),
        CategoryCard(
            image = R.drawable.animalhorse,
            text = "At"
        ),
        CategoryCard(
            image = R.drawable.animalmouse,
            text = "Fare"
        ),
        CategoryCard(
            image = R.drawable.animalsquirrel,
            text = "Sincap"
        ),
        CategoryCard(
            image = R.drawable.animalbats,
            text = "Yarasa"
        ),
        CategoryCard(
            image = R.drawable.animalwolf,
            text = "Kurt"
        ),
        CategoryCard(
            image = R.drawable.animalshark,
            text = "Köpekbalığı"
        ),
        CategoryCard(
            image = R.drawable.animaldolphin,
            text = "Yunus"
        ),
        CategoryCard(
            image = R.drawable.animaltiger,
            text = "Kaplan"
        ),
        CategoryCard(
            image = R.drawable.animallion,
            text = "Aslan"
        ),
        CategoryCard(
            image = R.drawable.animalelephant,
            text = "Fil"
        ),
        CategoryCard(
            image = R.drawable.animalcrow,
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

@Composable
fun familyList(): List<CategoryCard>{
    return listOf(
        CategoryCard(
            image = R.drawable.familydad,
            text = "Baba"
        ),
        CategoryCard(
            image = R.drawable.familymom,
            text = "Anne"
        ),
        CategoryCard(
            image = R.drawable.familygirl,
            text = "Kız çocuk"
        ),
        CategoryCard(
            image = R.drawable.familyson,
            text = "Erkek çocuk"
        ),
        CategoryCard(
            image = R.drawable.familysis,
            text = "Kız kardeş"
        ),
        CategoryCard(
            image = R.drawable.familybrother,
            text = "Erkek kardeş"
        ),
        CategoryCard(
            image = R.drawable.familygrandma,
            text = "Büyükanne"
        ),
        CategoryCard(
            image = R.drawable.familygrandpa,
            text = "Büyükbaba"
        ),
        CategoryCard(
            image = R.drawable.familypet,
            text = "Evcil hayvan"
        ),
        CategoryCard(
            image = R.drawable.familyfamous,
            text = "Other"
        ),
    )
}

@Composable
fun weatherList(): List<CategoryCard>{
    return listOf(
        CategoryCard(
            image = R.drawable.sweatherunset,
            text = "Güneşli"
        ),
        CategoryCard(
            image = R.drawable.weathercloudy,
            text = "Bulutlu"
        ),
        CategoryCard(
            image = R.drawable.weatherfoggy,
            text = "Sisli"
        ),
        CategoryCard(
            image = R.drawable.weatherstorm,
            text = "Fırtınalı"
        ),
        CategoryCard(
            image = R.drawable.weatherrain,
            text = "Yağmurlu"
        ),
        CategoryCard(
            image = R.drawable.weathersnow,
            text = "Karlı"
        ),

        CategoryCard(
            image = R.drawable.weatherwind,
            text = "Rüzgarlı"
        ),

        CategoryCard(
            image = R.drawable.weatherclear,
            text = "Açık"
        )
    )
}