package com.next.up.code.capstone.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.next.up.code.core.domain.usecase.CoreUseCase

class HomeViewModel(coreUseCase: CoreUseCase) : ViewModel() {
    val getTouristAttraction = coreUseCase.getAllTouristAttraction().asLiveData()

}