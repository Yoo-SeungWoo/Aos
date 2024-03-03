package kr.co.kit452.android.data.remote.source

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.data.remote.source.dao.TotalGamumDao
import kr.co.kit452.android.domain.model.ForecastItemEntity
import kr.co.kit452.android.domain.repository.TotalGamumRepository
import javax.inject.Inject

class TotalRepositoryImpl @Inject constructor(private val totalGamumDao: TotalGamumDao) : TotalGamumRepository {

    override fun observeAllForecastItems(): Flow<List<ForecastItemEntity>> {
        return totalGamumDao.observeAllForecastItems()
    }

    override suspend fun addForecastItems(vararg forecastItem: ForecastItemEntity) {
        totalGamumDao.addForecastItems(*forecastItem)
    }

    override suspend fun removeForecastItem(forecastItem: ForecastItemEntity) {
        totalGamumDao.removeForecastItem(forecastItem)
    }

    override suspend fun removeAllForecastItems() {
        totalGamumDao.removeAllForecastItems()
    }
}
