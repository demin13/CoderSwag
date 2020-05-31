package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")

    )
    val hats = listOf(
        Product("Devslopes Graphic Beanie", "Rs900","hat01"),
        Product("DevSlopes Hat Black", "Rs1400","hat02"),
        Product("Devslopes Hat White", "Rs1100","hat03"),
        Product("Devslopes Hat snapback", "Rs1300","hat04")

    )
    val hoodies = listOf(
        Product("Devslopes  Hoodie Gray", "Rs1900","hoodies01"),
        Product("DevSlopes Hoodie Red", "Rs2300","hoodies02"),
        Product("Devslopes Gray Hoodie", "Rs3100","hoodies03"),
        Product("Devslopes Black Hoodie", "Rs1200","hoodies04")

    )
    val shirts = listOf(
        Product("Devslopes Shirt balck", "Rs1500","shirt01"),
        Product("DevSlopes badge light gray", "Rs1600","shirt02"),
        Product("Devslopes logo shirt red", "Rs1800","shirt03"),
        Product("Devslopes hustle", "Rs1900","shirt04"),
        Product("KickFlip Studios", "Rs 2500","shirt05")

    )
}