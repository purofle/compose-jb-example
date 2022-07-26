package com.example.utils

import kotlinx.coroutines.CoroutineScope

open class ViewModel {
    lateinit var viewModelScope: CoroutineScope

    open fun init(viewModelScope: CoroutineScope) {
        this.viewModelScope = viewModelScope
    }
}