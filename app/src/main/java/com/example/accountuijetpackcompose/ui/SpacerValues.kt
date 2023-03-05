package com.example.accountuijetpackcompose.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SpacerVertical(value:Int){
    Spacer(modifier = Modifier.height(value.dp))
}
