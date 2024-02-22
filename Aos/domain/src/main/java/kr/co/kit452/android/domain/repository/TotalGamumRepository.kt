package kr.co.kit452.android.domain.repository

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.ForecastItemEntity

interface TotalGamumRepository {
    fun observeAllForecastItems(): Flow<List<ForecastItemEntity>>
    suspend fun addForecastItems(vararg forecastItem: ForecastItemEntity)
    suspend fun removeForecastItem(forecastItem: ForecastItemEntity)
    suspend fun removeAllForecastItems()
}