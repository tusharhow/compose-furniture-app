package com.example.furnitureshopapp.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furnitureshopapp.components.Appbar
import com.example.furnitureshopapp.components.CategoryList
import com.example.furnitureshopapp.components.FurnitureList
import com.example.furnitureshopapp.components.SearchBarComponent

@Composable
fun HomePage() {
    Column {
        Appbar()
        SearchBarComponent()
        Spacer(modifier = Modifier.height(16.dp))
        CategoryList()
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "Newly Added",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            ),
            modifier = Modifier.padding(start = 16.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        FurnitureList()
    }
}