package com.example.themesandanimations

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.themesandanimations.ui.theme.LittleLemonColor
@Preview
@Composable
fun ShapeHandler() {
    Surface(
        color = LittleLemonColor.yellow,
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(80.dp,0.dp,80.dp,0.dp),
        border = BorderStroke(10.dp,LittleLemonColor.orange)
    ) {

    }
}