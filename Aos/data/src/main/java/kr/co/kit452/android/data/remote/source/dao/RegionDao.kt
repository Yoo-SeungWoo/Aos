package kr.co.kit452.android.data.remote.source.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.RegionEntity

@Dao
interface RegionDao {
    @Query("SELECT * FROM region_with_code")
    fun observeAllRegions(): Flow<List<RegionEntity>>

    @Query("SELECT * FROM region_with_code WHERE 시도명 = :sidoName AND 시군명 = :sigunName")
    suspend fun observeRegionByName(sidoName: String, sigunName: String): RegionEntity
}

@Database(entities = [RegionEntity::class], version = 1)
abstract class RegionsDatabase : RoomDatabase() {
    abstract fun regionDao(): RegionDao
}