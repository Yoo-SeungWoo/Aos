package kr.co.kit452.android.domain.usecase

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.DetailGamumEntity
import kr.co.kit452.android.domain.repository.DetailGamumRepository

class DetailUsecase(private val detailGamumRepository: DetailGamumRepository) {

    fun observeAllDetailItems(): Flow<List<DetailGamumEntity>> {
        return detailGamumRepository.observeAllDetailItems()
    }

    suspend fun addDetailItems(vararg detailItems: DetailGamumEntity) {
        detailGamumRepository.addDetailItems(*detailItems)
    }

    suspend fun removeDetailItem(detailItem: DetailGamumEntity) {
        detailGamumRepository.removeDetailItem(detailItem)
    }

    suspend fun removeAllDetailItems() {
        detailGamumRepository.removeAllDetailItems()
    }

}
