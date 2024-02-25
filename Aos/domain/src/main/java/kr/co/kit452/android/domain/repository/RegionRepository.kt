package kr.co.kit452.android.domain.repository

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.RegionEntity

interface RegionRepository {
    fun observeAllRegions(): Flow<List<RegionEntity>>
    suspend fun observeRegionByName(sidoName: String, sigunName: String): RegionEntity
}