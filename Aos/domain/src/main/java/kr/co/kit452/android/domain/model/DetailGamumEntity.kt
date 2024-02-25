package kr.co.kit452.android.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "detail_item")
data class DetailGamumEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val trgetDe: String,
    val amtprcp: String?,
    val amtcldVu: String?,
    val rnlsDcnt: String?,
    val suplppcnt: String?,
    val livfacNow: String?,
    val livfac1mon: String?,
    val livfac2mon: String?,
    val livfac3mon: String?,
    val wethNow: String?,
    val weth1mon: String?,
    val weth2mon: String?,
    val weth3mon: String?
)
