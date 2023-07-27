package com.example.themesandanimations

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
    Column() {
        Surface(
            color = LittleLemonColor.yellow,
            modifier = Modifier
                .height(120.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Little",
                fontSize = 30.sp,
                modifier = Modifier
                    .wrapContentSize(align = Alignment.BottomCenter)
                    .border(2.dp, LittleLemonColor.charcoal)
            )
        }
        Surface(
            color = LittleLemonColor.pink,
            modifier = Modifier
                .height(100.dp)
                .fillMaxWidth()
        ) {
            Text(
                text = "Lemon",
                fontSize = 30.sp,
                modifier = Modifier
                    .padding(30.dp)
                    .wrapContentSize(align = Alignment.TopEnd)
                    .border(2.dp, LittleLemonColor.charcoal)
            )
        }
    }
}

@Preview
@Composable
fun SurfaceHandlerView(){
    SurfaceHandler()
}