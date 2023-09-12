package com.next.up.code.favorite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.next.up.code.core.domain.usecase.CoreUseCase

class FavoriteViewModel(coreUseCase: CoreUseCase) : ViewModel() {
    val touristAttraction = coreUseCase.getFavoriteTouristAttraction().asLiveData()
}