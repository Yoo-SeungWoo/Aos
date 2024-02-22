package kr.co.kit452.android.data.remote.model

import com.google.gson.annotations.SerializedName

data class ForecastItem(
    @SerializedName("anldt") val anldt: TextValue,
    @SerializedName("lniwtratent") val lniwtratent: TextValue,
    @SerializedName("lniwtratent1m") val lniwtratent1m: TextValue,
    @SerializedName("lniwtratent2m") val lniwtratent2m: TextValue,
    @SerializedName("lniwtratent3m") val lniwtratent3m: TextValue,
    @SerializedName("lniwtrbndry") val lniwtrbndry: TextValue,
    @SerializedName("lniwtrbndry1m") val lniwtrbndry1m: TextValue,
    @SerializedName("lniwtrbndry2m") val lniwtrbndry2m: TextValue,
    @SerializedName("lniwtrbndry3m") val lniwtrbndry3m: TextValue,
    @SerializedName("lniwtrintrst") val lniwtrintrst: TextValue,
    @SerializedName("lniwtrintrst1m") val lniwtrintrst1m: TextValue,
    @SerializedName("lniwtrintrst2m") val lniwtrintrst2m: TextValue,
    @SerializedName("lniwtrintrst3m") val lniwtrintrst3m: TextValue,
    @SerializedName("lniwtrmap") val lniwtrmap: TextValue,
    @SerializedName("lniwtrmap1m") val lniwtrmap1m: TextValue,
    @SerializedName("lniwtrmap2m") val lniwtrmap2m: TextValue,
    @SerializedName("lniwtrmap3m") val lniwtrmap3m: TextValue,
    @SerializedName("lniwtrserius") val lniwtrserius: TextValue,
    @SerializedName("lniwtrserius1m") val lniwtrserius1m: TextValue,
    @SerializedName("lniwtrserius2m") val lniwtrserius2m: TextValue,
    @SerializedName("lniwtrserius3m") val lniwtrserius3m: TextValue
)

data class ForecastItems(
    @SerializedName("item") val item: ForecastItem
)

data class ForecastBody(
    @SerializedName("items") val items: ForecastItems,
    @SerializedName("numOfRows") val numOfRows: TextValue,
    @SerializedName("pageNo") val pageNo: TextValue,
    @SerializedName("totalCount") val totalCount: TextValue
)

data class ForecastResponse(
    @SerializedName("body") val body: ForecastBody
)

data class ForecastRoot(
    @SerializedName("response") val response: ForecastResponse
)