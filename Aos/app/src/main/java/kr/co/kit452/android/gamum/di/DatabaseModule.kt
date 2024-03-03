package kr.co.kit452.android.gamum.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kr.co.kit452.android.data.remote.source.dao.DetailGamumDao
import kr.co.kit452.android.data.remote.source.dao.DetailGamumDatabase
import kr.co.kit452.android.data.remote.source.dao.ForecastDatabase
import kr.co.kit452.android.data.remote.source.dao.NewsDao
import kr.co.kit452.android.data.remote.source.dao.NewsDatabase
import kr.co.kit452.android.data.remote.source.dao.RegionDao
import kr.co.kit452.android.data.remote.source.dao.RegionsDatabase
import kr.co.kit452.android.data.remote.source.dao.TotalGamumDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideRegionsDatabase(@ApplicationContext context: Context): RegionsDatabase {
        return Room.databaseBuilder(
            context,
            RegionsDatabase::class.java,
            "region.db"
        ).createFromAsset("region.db")
            .build()
    }

    @Provides
    fun provideRegionDao(database: RegionsDatabase): RegionDao {
        return database.regionDao()
    }

    @Provides
    @Singleton
    fun provideDetailGamumDatabase(@ApplicationContext context: Context): DetailGamumDatabase {
        return Room.databaseBuilder(
            context,
            DetailGamumDatabase::class.java,
            "detail_item.db"
        ).build()
    }

    @Provides
    fun provideDetailGamumDao(database: DetailGamumDatabase): DetailGamumDao {
        return database.detailGamumDao()
    }

    // News 관련 항목 추가
    @Provides
    @Singleton
    fun provideNewsDatabase(@ApplicationContext context: Context): NewsDatabase {
        return Room.databaseBuilder(
            context,
            NewsDatabase::class.java,
            "news_item.db"
        ).build()
    }

    @Provides
    fun provideNewsDao(database: NewsDatabase): NewsDao {
        return database.newsDao()
    }

    // Total 관련 항목 추가
    @Provides
    @Singleton
    fun provideForecastDatabase(@ApplicationContext context: Context): ForecastDatabase {
        return Room.databaseBuilder(
            context,
            ForecastDatabase::class.java,
            "forecast_item.db"
        ).build()
    }

    @Provides
    fun provideTotalGamumDao(database: ForecastDatabase): TotalGamumDao {
        return database.totalGamumDao()
    }
}