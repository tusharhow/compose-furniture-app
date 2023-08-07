package com.example.furnitureshopapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furnitureshopapp.R

@Composable
fun Appbar() {
    Row(
        modifier = Modifier
            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(
                id = R.drawable.furniture_logo,

                ), contentDescription = null, modifier = Modifier.height(60.dp)
        )
        Text(
            text = "Furniture Shop",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            ),
            modifier = Modifier
                .align(Alignment.CenterVertically)
        )
    }
}
