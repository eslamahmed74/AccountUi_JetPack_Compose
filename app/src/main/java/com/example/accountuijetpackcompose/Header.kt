package com.example.accountuijetpackcompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.sp


@Composable
fun TextHeader(title:String, subTite:String){
    Column(Modifier.fillMaxWidth(),horizontalAlignment = Alignment.Start) {
        Text(text = title, fontSize = 16.sp, color = Color.Black)
        Text(text = subTite, fontSize = 12.sp, color = Color.Gray)
    }
}

