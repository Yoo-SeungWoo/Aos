package kr.co.kit452.android.data.remote.api

import kr.co.kit452.android.data.remote.model.NewsRoot
import retrofit2.http.GET

interface NewsGamumApi {
    @GET("api/newslist")
    suspend fun getNewsList(): NewsRoot
}