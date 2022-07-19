package com.example

import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.example.ui.feature.MainView
import org.slf4j.LoggerFactory

fun main() {
    application {
        Window(
            title = "Compose-jb-example",
            onCloseRequest = ::exitApplication
        ) {
            MaterialTheme {
                MainView()
            }
        }
    }
}