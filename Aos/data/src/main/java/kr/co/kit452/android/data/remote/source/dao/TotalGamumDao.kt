package kr.co.kit452.android.data.remote.source.dao

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.RoomDatabase
import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.ForecastItemEntity

@Dao
interface TotalGamumDao {
    @Query("SELECT * FROM forecast_item")
    fun observeAllForecastItems(): Flow<List<ForecastItemEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addForecastItems(vararg forecastItem: ForecastItemEntity)

    @Delete
    fun removeForecastItem(forecastItem: ForecastItemEntity)

    @Query("DELETE FROM forecast_item")
    suspend fun removeAllForecastItems()
}

@Database(entities = [ForecastItemEntity::class], version =  1)
abstract class ForecastDatabase : RoomDatabase() {
    abstract fun totalGamumDao(): TotalGamumDao
}
