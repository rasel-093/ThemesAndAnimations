package com.example.themesandanimations

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp

@Composable
fun TextAnimation1() {
   var visible by remember {
       mutableStateOf(true)
   }
    
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        AnimatedVisibility(
            visible = visible ,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Text(text = "Hello wordl!")
        }
        Button(onClick = { visible=!visible }) {
            Text(text = "Button")
        }
    }
}
@Composable
fun TextAnimation2(){
    var alphaImg by remember {
        mutableStateOf(0f)
    }
    val animateAlphaImg by animateFloatAsState(
        targetValue = alphaImg,
        animationSpec = tween(
            durationMillis = 4000
        )
    )
    //This animation can also be applied for image
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Hello World!",
            modifier =  Modifier.alpha(animateAlphaImg)
        )

        Button(onClick = {alphaImg += 1f}) {
            Text(text = "Button")
        }
//        Box(
//            modifier = Modifier
//                .height(50.dp)
//                .width(50.dp)
//                .background(Color.Blue)
//                .clickable { alphaImg += 1f }
//        )
    }
}