package kr.co.kit452.android.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "forecast_item")
data class ForecastItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val anldt: String,
    val lniwtratent: String?,
    val lniwtratent1m: String?,
    val lniwtratent2m: String?,
    val lniwtratent3m: String?,
    val lniwtrbndry: String?,
    val lniwtrbndry1m: String?,
    val lniwtrbndry2m: String?,
    val lniwtrbndry3m: String?,
    val lniwtrintrst: String?,
    val lniwtrintrst1m: String?,
    val lniwtrintrst2m: String?,
    val lniwtrintrst3m: String?,
    val lniwtrmap: String?,
    val lniwtrmap1m: String?,
    val lniwtrmap2m: String?,
    val lniwtrmap3m: String?,
    val lniwtrserius: String?,
    val lniwtrserius1m: String?,
    val lniwtrserius2m: String?,
    val lniwtrserius3m: String?
)
