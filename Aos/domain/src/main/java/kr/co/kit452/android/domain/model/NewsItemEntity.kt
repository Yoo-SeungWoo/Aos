package kr.co.kit452.android.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "news_item")
data class NewsItemEntity(
    @PrimaryKey(autoGenerate = true) val id: Int,
    val kwrd: String?,
    val mscmnc: String,
    val newsdate: String,
    val site: String,
    val tit: String,
    val addr: String? = null
)
