package com.next.up.code.capstone.di


import com.next.up.code.capstone.ui.detail.DetailViewModel
import com.next.up.code.capstone.ui.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModules = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
}