package com.egiwon.architecturestudy.tabs.bottomsheet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.egiwon.architecturestudy.data.NaverDataRepository

class HistoryViewModelFactory(
    private val naverDataRepository: NaverDataRepository
) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return HistoryViewModel(naverDataRepository) as T
    }
}