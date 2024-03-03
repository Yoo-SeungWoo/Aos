package kr.co.kit452.android.gamum.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.kit452.android.data.remote.source.DetailGamumRepositoryImpl
import kr.co.kit452.android.data.remote.source.NewsRepositoryImpl
import kr.co.kit452.android.data.remote.source.RegionRepositoryImpl
import kr.co.kit452.android.data.remote.source.TotalRepositoryImpl
import kr.co.kit452.android.domain.repository.DetailGamumRepository
import kr.co.kit452.android.domain.repository.NewsRepository
import kr.co.kit452.android.domain.repository.RegionRepository
import kr.co.kit452.android.domain.repository.TotalGamumRepository

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindRegionRepository(repo: RegionRepositoryImpl): RegionRepository

    @Binds
    abstract fun bindDetailGamumRepository(repo: DetailGamumRepositoryImpl): DetailGamumRepository

    // News 관련 Repository 추가
    @Binds
    abstract fun bindNewsRepository(repo: NewsRepositoryImpl): NewsRepository

    // Total 관련 Repository 추가
    @Binds
    abstract fun bindTotalGamumRepository(repo: TotalRepositoryImpl): TotalGamumRepository
}