package kr.co.kit452.android.data.remote.model

import com.google.gson.annotations.SerializedName

data class TextValue(
    @SerializedName("_text") val value: String
)