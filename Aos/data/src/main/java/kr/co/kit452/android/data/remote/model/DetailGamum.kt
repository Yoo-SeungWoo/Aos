package kr.co.kit452.android.data.remote.model

import com.google.gson.annotations.SerializedName

data class DetailItem(
    @SerializedName("trgetDe") val trgetDe: TextValue, // 일자
    @SerializedName("amtprcp") val amtprcp: TextValue?, // 강수량
    @SerializedName("amtcldVu") val amtcldVu: TextValue?, // 날씨
    @SerializedName("rnlsDcnt") val rnlsDcnt: TextValue?, // 무강우일수
    @SerializedName("suplppcnt") val suplppcnt: TextValue?, // 비상급수현황
    @SerializedName("livfacNow") val livfacNow: TextValue?, // 조회 지역의 생공용수 가뭄현황
    @SerializedName("livfac_1mon") val livfac1mon: TextValue?, // 조회 지역의 생공용수 가뭄 1개월 전망
    @SerializedName("livfac_2mon") val livfac2mon: TextValue?, // 조회 지역의 생공용수 가뭄 2개월 전망
    @SerializedName("livfac_3mon") val livfac3mon: TextValue?, // 조회 지역의 생공용수 가뭄 3개월 전망
    @SerializedName("wethNow") val wethNow: TextValue?, // 조회 지역의 기상 가뭄현황
    @SerializedName("weth_1mon") val weth1mon: TextValue?, // 조회 지역의 기상 가뭄 1개월 전망
    @SerializedName("weth_2mon") val weth2mon: TextValue?, // 조회 지역의 기상 가뭄 2개월 전망
    @SerializedName("weth_3mon") val weth3mon: TextValue?  // 조회 지역의 기상 가뭄 3개월 전망
)

data class DetailItems(
    @SerializedName("item") val item: List<DetailItem>
)

data class DetailBody(
    @SerializedName("items") val items: DetailItems,
    @SerializedName("numOfRows") val numOfRows: TextValue,
    @SerializedName("pageNo") val pageNo: TextValue,
    @SerializedName("totalCount") val totalCount: TextValue
)

data class DetailResponse(
    @SerializedName("body") val body: DetailBody
)

data class DetailRoot(
    @SerializedName("response") val response: DetailResponse
)