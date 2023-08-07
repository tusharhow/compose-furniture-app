package com.example.furnitureshopapp.models

import com.example.furnitureshopapp.R

data class Furniture(
    val id: Int,
    val name: String,
    val price: Int,
    val image: Int,
    val description: String,
)

val furnitureList = listOf(
    Furniture(
        id = 1,
        name = "Chair",
        price = 5000,
        image = R.drawable.furniture_1,
        description = "This is a chair"
    ),
    Furniture(
        id = 2,
        name = "Table",
        price = 10000,
        image =  R.drawable.furniture_2,
        description = "This is a table"
    ),
    Furniture(
        id = 3,
        name = "Sofa",
        price = 15000,
        image =  R.drawable.furniture_3,
        description = "This is a sofa"
    ),
    Furniture(
        id = 4,
        name = "Bed",
        price = 20000,
        image =  R.drawable.furniture_4,
        description = "This is a bed"
    ),
    Furniture(
        id = 5,
        name = "Chair",
        price = 5000,
        image =  R.drawable.sofa_1,
        description = "This is a chair"
    ),
    Furniture(
        id = 6,
        name = "Table",
        price = 10000,
        image =   R.drawable.sofa_2,
        description = "This is a table"
    ),
    Furniture(
        id = 7,
        name = "Sofa",
        price = 15000,
        image =  R.drawable.sofa_3,
        description = "This is a sofa"
    ),

)
