package com.example.accountuijetpackcompose.ui

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InformationCard(name:String, information:String,modifier: Modifier=Modifier.fillMaxWidth().height(70.dp).clip(RectangleShape)){
    Card(modifier = modifier,onClick = { }) {
        Text(text = name, color = Color.Gray, fontSize = 12.sp, modifier = Modifier.padding(top=10.dp, start = 15.dp))
        Text(text = information, color = Color.Black, fontSize = 20.sp,modifier = Modifier.padding(top=5.dp, start = 15.dp))
    }
}