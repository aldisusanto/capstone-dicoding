package com.next.up.code.capstone.ui.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.next.up.code.core.domain.model.TouristAttraction
import com.next.up.code.core.domain.usecase.CoreUseCase

class DetailViewModel(
    private val coreUseCase: CoreUseCase
) : ViewModel() {
    fun getTicket(id: Int) = coreUseCase.getTicket(id).asLiveData()
    fun getRent(id: Int) = coreUseCase.getRent(id).asLiveData()
    fun getGallery(id: Int) = coreUseCase.getGallery(id).asLiveData()
    fun getVideo(id: Int) = coreUseCase.getVideo(id).asLiveData()
    fun setFavoriteTouristAttraction(touristAttraction: TouristAttraction, newStatus: Boolean) =
        coreUseCase.setFavoriteTouristAttraction(touristAttraction, newStatus)


}