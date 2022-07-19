package com.example.ui.navigation

import androidx.compose.runtime.Composable
import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.ExperimentalDecomposeApi
import com.arkivanov.decompose.extensions.compose.jetbrains.Children
import com.arkivanov.decompose.router.push
import com.arkivanov.decompose.router.router
import com.arkivanov.essenty.parcelable.Parcelable
import com.example.di.AppComponent
import com.example.di.DaggerAppComponent
import com.example.ui.feature.about.AboutScreenComponent
import com.example.ui.feature.home.HomeScreenComponent


class NavHostComponent(
    private val componentContext: ComponentContext,
    private val selectedItem: Int
    ): Component, ComponentContext by componentContext {

    private val appComponent: AppComponent = DaggerAppComponent.create()

    sealed class Config : Parcelable {
        object Home : Config()
        object About : Config()
    }

    private val router = router<Config, Component>(
        initialConfiguration = Config.Home,
        childFactory = ::createScreenComponent
    )

    private fun createScreenComponent(config: Config, componentContext: ComponentContext): Component = when (config) {
        is Config.Home -> HomeScreenComponent(
            appComponent = appComponent,
            componentContext = componentContext
        )
        is Config.About -> AboutScreenComponent(
            componentContext = componentContext
        )
    }

    @OptIn(ExperimentalDecomposeApi::class)
    @Composable
    override fun render() {
        Children(
            routerState = router.state
        ) { child ->
            child.instance.render()
        }
        when (selectedItem) {
            1 -> router.push(Config.About)
        }
    }
}