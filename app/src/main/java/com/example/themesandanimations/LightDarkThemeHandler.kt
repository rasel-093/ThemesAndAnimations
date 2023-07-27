package com.example.themesandanimations

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import com.example.themesandanimations.ui.theme.ThemesAndAnimationsTheme

@Composable
fun LightDarkThemeHandler(){
    ThemesAndAnimationsTheme() {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Little Lemon")
            Text(text = "Cicago")
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 1")
            }
            Button(onClick = { /*TODO*/ }) {
                Text(text = "Button 2")
            }
            OutlinedButton(onClick = { /*TODO*/ }) {
                Text(text = "OutlinedButton")
            }
            Slider(value = 5f, onValueChange = {})
        }
    }
}
@Preview(showBackground = true)
@Composable
fun AppScreenPreviewLight() {
    AppScreen()
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun AppScreenPreviewDark() {
    AppScreen()
}