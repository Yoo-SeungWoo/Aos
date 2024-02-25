package kr.co.kit452.android.domain.model

import androidx.room.*

@Entity(tableName = "region_with_code")
data class RegionEntity(
    @PrimaryKey @ColumnInfo(name = "코드") val code: Int,
    @ColumnInfo(name = "시도명") val sidoName: String,
    @ColumnInfo(name = "시군명") val sigunName: String,
    @ColumnInfo(name = "x") val x: Float,
    @ColumnInfo(name = "y") val y: Float
)