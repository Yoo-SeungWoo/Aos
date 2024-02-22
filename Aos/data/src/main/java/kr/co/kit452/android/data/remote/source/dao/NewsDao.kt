package kr.co.kit452.android.data.remote.source.dao

import androidx.room.Dao
import androidx.room.Database
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.RoomDatabase
import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.NewsItemEntity

@Dao
interface NewsDao {
    @Query("SELECT * FROM news_item")
    fun observeAllNewsItems(): Flow<List<NewsItemEntity>>

    @Query("SELECT * FROM news_item WHERE id IN (:ids)")
    fun observeNewsItemsByIds(ids: IntArray): List<NewsItemEntity>

    @Query("SELECT * FROM news_item WHERE tit LIKE :title")
    fun observeNewsItemsByTitle(title: String): List<NewsItemEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addNewsItems(vararg newsItems: NewsItemEntity)

    @Query("DELETE FROM news_item")
    suspend fun removeAllNewsItems()
}

@Database(entities = [NewsItemEntity::class], version = 1)
abstract class NewsDatabase : RoomDatabase() {
    abstract fun newsDao(): NewsDao
}
