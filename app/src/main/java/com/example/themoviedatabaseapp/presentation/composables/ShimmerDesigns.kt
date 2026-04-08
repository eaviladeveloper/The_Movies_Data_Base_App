package com.example.themoviedatabaseapp.presentation.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import com.example.themoviedatabaseapp.R

@Composable
fun ShimmerHomeResults() {
    SetSpace(16, 1)
    SetBox(1f, 35)
    SetSpace(16, 1)
    repeat(3) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = dimensionResource(R.dimen.size_10dp))
        ) {
            Column {
                SetBox(1f, 500, true)
                SetSpace(16, 1)
                SetBox(0.7f, 25)
                SetSpace(8, 1)
            }
        }
    }
}

@Composable
fun ShimmerDetailView() {
    SetBox(1f, 500)
    SetSpace(10, 1)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = dimensionResource(R.dimen.size_10dp))
    ) {
        Row(modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.size_10dp))) {
                SetBox(0.5f, 30)
                SetSpace(15,2)
                SetBox(0.5f, 30, true)
        }
        Column(modifier = Modifier.padding(horizontal = dimensionResource(R.dimen.size_10dp))) {
            SetSpace(20,1)
            SetBox(1f, 15)
            SetSpace(10,1)
            SetBox(1f, 15)
            SetSpace(10,1)
            SetBox(0.5f, 15)
        }
    }
}

@Composable
fun ShimmerDetailsResults(){
    repeat(3) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = dimensionResource(R.dimen.size_10dp))
        ) {
            Column {
                SetBox(1f, 500, true)
                SetSpace(16, 1)
                SetBox(0.7f, 25)
                SetSpace(8, 1)
            }
        }
    }
}