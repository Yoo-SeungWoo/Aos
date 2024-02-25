package kr.co.kit452.android.data.remote.api

import kr.co.kit452.android.data.remote.model.DetailRoot
import retrofit2.http.GET
import retrofit2.http.Query

interface DetailGamumApi {
    @GET("api/detailGamum")
    suspend fun getDetailGamum(@Query("sigunCd") sigunCd: String): DetailRoot
}