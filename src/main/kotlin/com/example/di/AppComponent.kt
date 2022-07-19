package com.example.di

import com.example.ui.feature.home.HomeScreenComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component
interface AppComponent {
    fun inject(homeScreenComponent: HomeScreenComponent)
}