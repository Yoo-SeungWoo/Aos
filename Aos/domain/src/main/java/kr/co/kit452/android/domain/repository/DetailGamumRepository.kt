package kr.co.kit452.android.domain.repository

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.DetailGamumEntity

interface DetailGamumRepository {

    fun observeAllDetailItems(): Flow<List<DetailGamumEntity>>

    suspend fun addDetailItems(vararg detailItems: DetailGamumEntity)

    suspend fun removeDetailItem(detailItem: DetailGamumEntity)

    suspend fun removeAllDetailItems()

}
