package kr.co.kit452.android.domain.usecase

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.ForecastItemEntity
import kr.co.kit452.android.domain.repository.TotalGamumRepository

class TotalUsecase(private val totalGamumRepository: TotalGamumRepository) {
    fun observeAllItems(): Flow<List<ForecastItemEntity>> {
        return totalGamumRepository.observeAllForecastItems()
    }

    suspend fun addItems(vararg forecastItem: ForecastItemEntity) {
        totalGamumRepository.addForecastItems(*forecastItem)
    }

    suspend fun removeItem(forecastItem: ForecastItemEntity) {
        totalGamumRepository.removeForecastItem(forecastItem)
    }

    suspend fun removeAllItems() {
        totalGamumRepository.removeAllForecastItems()
    }
}
