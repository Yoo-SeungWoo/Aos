package kr.co.kit452.android.data.remote.model

import com.google.gson.annotations.SerializedName

data class NewsItem(
    @SerializedName("kwrd") val kwrd: TextValue,
    @SerializedName("mscmnc") val mscmnc: TextValue,
    @SerializedName("newsdate") val newsdate: TextValue,
    @SerializedName("site") val site: TextValue,
    @SerializedName("tit") val tit: TextValue,
    @SerializedName("addr") val addr: TextValue? = null
)

data class NewsItems(
    @SerializedName("item") val item: List<NewsItem>
)

data class NewsBody(
    @SerializedName("items") val items: NewsItems,
    @SerializedName("numOfRows") val numOfRows: TextValue,
    @SerializedName("pageNo") val pageNo: TextValue,
    @SerializedName("totalCount") val totalCount: TextValue
)

data class NewsResponse(
    @SerializedName("body") val body: NewsBody
)

data class NewsRoot(
    @SerializedName("response") val response: NewsResponse
)
