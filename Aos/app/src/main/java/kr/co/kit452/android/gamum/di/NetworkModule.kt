package kr.co.kit452.android.gamum.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.co.kit452.android.data.remote.api.DetailGamumApi
import kr.co.kit452.android.data.remote.api.NewsGamumApi
import kr.co.kit452.android.data.remote.api.TotalGamumApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://10.0.2.2:3010/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun provideDetailGamumApi(retrofit: Retrofit): DetailGamumApi {
        return retrofit.create(DetailGamumApi::class.java)
    }

    // News 관련 API 추가
    @Provides
    fun provideNewsGamumApi(retrofit: Retrofit): NewsGamumApi {
        return retrofit.create(NewsGamumApi::class.java)
    }

    // Total 관련 API 추가
    @Provides
    fun provideTotalGamumApi(retrofit: Retrofit): TotalGamumApi {
        return retrofit.create(TotalGamumApi::class.java)
    }
}