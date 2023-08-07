package com.example.furnitureshopapp.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furnitureshopapp.models.listOfCategory

@Composable
fun CategoryList() {

    var selectedCategory by remember { mutableStateOf(0) }
    LazyRow(

        contentPadding = PaddingValues(5.dp),
    ) {
        items(
            count = listOfCategory.size
        ) { item ->

            Card(
                modifier = Modifier
                    .padding(5.dp)
                    .clickable {
                        selectedCategory = item
                    },
                shape = RoundedCornerShape(10.dp),
                colors = CardDefaults.cardColors(
                    containerColor = if (selectedCategory == item) MaterialTheme.colorScheme.surfaceVariant else Color.Transparent,
                ),

                ) {
                Text(
                    text = listOfCategory[item].title,
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 16.sp,
                        color = if (selectedCategory == item) Color.Black else Color.Gray
                    )
                )
            }

        }

    }

}