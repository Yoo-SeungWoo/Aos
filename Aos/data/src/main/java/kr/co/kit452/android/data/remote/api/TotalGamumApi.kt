package kr.co.kit452.android.data.remote.api

import kr.co.kit452.android.data.remote.model.ForecastRoot
import retrofit2.http.GET

interface TotalGamumApi {
    @GET("api/forecast")
    suspend fun getTotalList(): ForecastRoot
}