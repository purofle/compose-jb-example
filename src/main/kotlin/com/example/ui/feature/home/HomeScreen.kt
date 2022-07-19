package com.example.ui.feature.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    Scaffold {

        Scaffold(topBar = {
            SmallTopAppBar({ Text("Example") })
        }) {

            var text by remember { mutableStateOf(0) }

            Column(modifier = Modifier.padding(it)) {

                Button({ text += 1 }) { Text("It is a example") }
                Text(text.toString())

            }
        }
    }
}
