package kr.co.kit452.android.data.remote.source

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.data.remote.source.dao.NewsDao
import kr.co.kit452.android.domain.model.NewsItemEntity
import kr.co.kit452.android.domain.repository.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val newsDao: NewsDao) : NewsRepository {
    override fun observeAllNewsItems(): Flow<List<NewsItemEntity>> {
        return newsDao.observeAllNewsItems()
    }

    override fun observeNewsItemsByTitle(title: String): List<NewsItemEntity> {
        return newsDao.observeNewsItemsByTitle(title)
    }

    override suspend fun addNewsItems(vararg newsItems: NewsItemEntity) {
        newsDao.addNewsItems(*newsItems)
    }

    override suspend fun removeAllNewsItems() {
        newsDao.removeAllNewsItems()
    }
}