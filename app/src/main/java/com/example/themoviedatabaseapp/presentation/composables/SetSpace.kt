package com.example.themoviedatabaseapp.presentation.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SetSpace(value: Int, alignment : Int) {
    if (alignment == 1)
        Spacer(modifier = Modifier.height(value.dp))
    else
        Spacer(modifier = Modifier.width(value.dp))
}