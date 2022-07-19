package com.example.ui.feature.home

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import com.arkivanov.decompose.ComponentContext
import com.example.di.AppComponent
import com.example.ui.navigation.Component
import javax.inject.Inject

class HomeScreenComponent(
    private val componentContext: ComponentContext,
    appComponent: AppComponent
): Component, ComponentContext by componentContext {

    @Inject
    lateinit var viewModel: HomeViewModel

    init {
        appComponent.inject(this)
    }
    @Composable
    override fun render() {
        val scope = rememberCoroutineScope()
        LaunchedEffect(viewModel) {
            viewModel.init(scope)
        }

        HomeScreen()
    }
}