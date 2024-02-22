package kr.co.kit452.android.domain.repository

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.NewsItemEntity

interface NewsRepository {
    fun observeAllNewsItems(): Flow<List<NewsItemEntity>>
    fun observeNewsItemsByTitle(title: String): List<NewsItemEntity>
    suspend fun addNewsItems(vararg newsItems: NewsItemEntity)
    suspend fun removeAllNewsItems()
}