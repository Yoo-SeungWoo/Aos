package kr.co.kit452.android.data.remote.source.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.DetailGamumEntity

@Dao
interface DetailGamumDao {
    @Query("SELECT * FROM detail_item")
    fun observeAllDetailItems(): Flow<List<DetailGamumEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addDetailItems(vararg detailItem: DetailGamumEntity)

    @Delete
    fun removeDetailItem(detailItem: DetailGamumEntity)

    @Query("DELETE FROM detail_item")
    suspend fun removeAllDetailItems()
}

@Database(entities = [DetailGamumEntity::class], version = 1)
abstract class DetailGamumDatabase : RoomDatabase() {
    abstract fun detailGamumDao(): DetailGamumDao
}