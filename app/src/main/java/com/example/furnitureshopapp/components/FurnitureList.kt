package com.example.furnitureshopapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.furnitureshopapp.models.furnitureList

@Composable
fun FurnitureList() {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 150.dp),
        contentPadding = PaddingValues(5.dp),
    ) {

        items(
            count = furnitureList.size, itemContent = { item ->

                Card(
                    modifier = Modifier
                        .padding(5.dp)
                        .fillMaxSize(),
                    shape = RoundedCornerShape(10.dp),

                    ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = furnitureList[item].image),
                            contentDescription = null,
                            modifier = Modifier
                                .height(110.dp)
                        )
                        Text(
                            text = furnitureList[item].name,
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp
                            ),

                            )
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(
                            text = "$${furnitureList[item].price}", style = TextStyle(

                                fontSize = 16.sp,


                                )
                        )
                        Spacer(modifier = Modifier.height(10.dp))
                        Button(
                            modifier = Modifier
                                .padding(10.dp)
                                .width(130.dp)
                                .height(40.dp),
                            onClick = { /*TODO*/ }) {
                            Text("Add to cart")
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                    }
                }

            })
    }
}