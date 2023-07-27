package com.example.themesandanimations

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.themesandanimations.ui.theme.LittleLemonColor

@Composable
fun FontTypeHandler() {
    Column( Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {
        Text(
            text = "Little Lemon",
            style = TextStyle(
                color = LittleLemonColor.yellow,
                fontSize = 24.sp,
                fontFamily = FontFamily.Monospace,
                letterSpacing = 4.sp,
                shadow = Shadow(
                    color = Color.Black,
                    offset = Offset(8f,8f),
                    blurRadius = 4f
                )
            ),
            modifier = Modifier.width(300.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.combine(
                listOf(TextDecoration.Underline,TextDecoration.LineThrough)
            )
        )
        //Let’s use the buildAnnotatedString function to change the
        // color and size of the single letter.
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = LittleLemonColor.yellow,
                        fontSize = 20.sp
                    )
                ) {
                    append("L")
                }
                append("ittle")
                withStyle(
                    style = SpanStyle(
                        color = LittleLemonColor.yellow,
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                ) {
                    append("L")
                }
                append("emon")
            }
        )
    }
}

@Preview
@Composable
fun FontTypeAndShapeHandlerView() {
    FontTypeHandler()
}