package com.example.ui.feature

import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.*
import androidx.compose.runtime.*
import com.arkivanov.decompose.DefaultComponentContext
import com.arkivanov.essenty.lifecycle.LifecycleRegistry
import com.example.ui.navigation.NavHostComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainView() {
    var selectedItem by remember { mutableStateOf(0) }
    val items = listOf("Home", "About")
    val icons = listOf(Icons.Filled.Home, Icons.Filled.Info)
    val lifecycle = LifecycleRegistry()
    Scaffold {
        Row {
            NavigationRail {
                items.forEachIndexed { index, item ->
                    NavigationRailItem(
                        icon = { Icon(icons[index], contentDescription = item) },
                        label = { Text(item) },
                        selected = selectedItem == index,
                        onClick = {
                            selectedItem = index
                        },
                        alwaysShowLabel = false
                    )
                }
            }
            NavHostComponent(DefaultComponentContext(lifecycle), selectedItem).render()
        }
    }
}