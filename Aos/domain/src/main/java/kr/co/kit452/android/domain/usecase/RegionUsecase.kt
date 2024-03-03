package kr.co.kit452.android.domain.usecase

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kr.co.kit452.android.domain.model.RegionEntity
import kr.co.kit452.android.domain.repository.RegionRepository
import javax.inject.Inject

class RegionUsecase @Inject constructor(private val regionRepository: RegionRepository) {

    fun observeAllRegions(): Flow<List<RegionEntity>> {
        return regionRepository.observeAllRegions()
    }

    fun observeRegionItem(): StateFlow<RegionEntity?> {
        return regionRepository.observeRegionItem()
    }

    suspend fun observeRegionByName(sidoName: String, sigunName: String): RegionEntity {
        return regionRepository.observeRegionByName(sidoName, sigunName)
    }
}