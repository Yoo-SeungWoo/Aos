package kr.co.kit452.android.data.remote.source

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.data.remote.source.dao.RegionDao
import kr.co.kit452.android.domain.model.RegionEntity
import kr.co.kit452.android.domain.repository.RegionRepository

class RegionRepositoryImpl(private val regionDao: RegionDao) : RegionRepository {
    override fun observeAllRegions(): Flow<List<RegionEntity>> {
        return regionDao.observeAllRegions()
    }

    override suspend fun observeRegionByName(sidoName: String, sigunName: String): RegionEntity {
        return regionDao.observeRegionByName(sidoName, sigunName)
    }
}