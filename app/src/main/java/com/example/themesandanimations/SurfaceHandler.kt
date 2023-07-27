package com.example.themesandanimations

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.themesandanimations.ui.theme.LittleLemonColor

@Composable
fun SurfaceHandler() {
    Surface(
        color = LittleLemonColor.yellow,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Lemon",
            fontSize = 40.sp,
            modifier = Modifier
                .padding(30.dp)
                .wrapContentSize(align = Alignment.TopStart)
                .border(2.dp, LittleLemonColor.charcoal)
        )
    }
}

@Preview
@Composable
fun SurfaceHandlerView(){
    SurfaceHandler()
}