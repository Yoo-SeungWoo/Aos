package kr.co.kit452.android.domain.usecase

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.RegionEntity
import kr.co.kit452.android.domain.repository.RegionRepository

class RegionUsecase(private val regionRepository: RegionRepository) {
    fun observeAllRegions(): Flow<List<RegionEntity>> {
        return regionRepository.observeAllRegions()
    }

    suspend fun observeRegionByName(sidoName: String, sigunName: String): RegionEntity {
        return regionRepository.observeRegionByName(sidoName, sigunName)
    }
}