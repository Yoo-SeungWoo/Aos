package kr.co.kit452.android.data.remote.source

import android.util.Log
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kr.co.kit452.android.data.remote.source.dao.RegionDao
import kr.co.kit452.android.domain.model.RegionEntity
import kr.co.kit452.android.domain.repository.RegionRepository
import javax.inject.Inject

class RegionRepositoryImpl @Inject constructor(private val regionDao: RegionDao): RegionRepository
{
    private val _regionItem = MutableStateFlow<RegionEntity?>(null)
    val regionItem: StateFlow<RegionEntity?> get() = _regionItem

    override fun observeAllRegions(): Flow<List<RegionEntity>> {
        Log.d("RegionRepositoryImpl", "observeAllRegions is called")
        return regionDao.observeAllRegions()
    }

    override fun observeRegionItem(): StateFlow<RegionEntity?> = regionItem

    override suspend fun observeRegionByName(sidoName: String, sigunName: String): RegionEntity {
        val region = regionDao.observeRegionByName(sidoName, sigunName)
        _regionItem.value = region
        return region
    }
}