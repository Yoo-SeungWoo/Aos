package kr.co.kit452.android.domain.usecase

import kotlinx.coroutines.flow.Flow
import kr.co.kit452.android.domain.model.NewsItemEntity
import kr.co.kit452.android.domain.repository.NewsRepository

class NewsUsecase(private val newsRepository: NewsRepository) {
    fun observeAllNewsItems(): Flow<List<NewsItemEntity>> {
        return newsRepository.observeAllNewsItems()
    }

    fun observeNewsItemsByTitle(title: String): List<NewsItemEntity> {
        return newsRepository.observeNewsItemsByTitle(title)
    }

    suspend fun addNewsItems(vararg newsItems: NewsItemEntity) {
        newsRepository.addNewsItems(*newsItems)
    }

    suspend fun removeAllNewsItems() {
        newsRepository.removeAllNewsItems()
    }
}
