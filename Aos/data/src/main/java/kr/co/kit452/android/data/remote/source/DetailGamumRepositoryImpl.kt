package kr.co.kit452.android.data.remote.source

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.data.remote.source.dao.DetailGamumDao
import kr.co.kit452.android.domain.model.DetailGamumEntity
import kr.co.kit452.android.domain.repository.DetailGamumRepository
import javax.inject.Inject

class DetailGamumRepositoryImpl @Inject constructor(private val detailGamumDao: DetailGamumDao) :
    DetailGamumRepository {

    override fun observeAllDetailItems(): Flow<List<DetailGamumEntity>> {
        return detailGamumDao.observeAllDetailItems()
    }

    override suspend fun addDetailItems(vararg detailItems: DetailGamumEntity) {
        detailGamumDao.addDetailItems(*detailItems)
    }

    override suspend fun removeDetailItem(detailItem: DetailGamumEntity) {
        detailGamumDao.removeDetailItem(detailItem)
    }

    override suspend fun removeAllDetailItems() {
        detailGamumDao.removeAllDetailItems()
    }
}
