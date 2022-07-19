package com.example.ui.feature.about

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.example.ui.navigation.Component

class AboutScreenComponent(
    private val componentContext: ComponentContext
): Component, ComponentContext by componentContext {

    @Composable
    override fun render() {
        AboutScreen()
    }
}