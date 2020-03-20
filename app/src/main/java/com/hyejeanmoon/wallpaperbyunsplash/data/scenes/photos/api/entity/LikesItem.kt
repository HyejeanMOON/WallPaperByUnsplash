package com.hyejeanmoon.wallpaperbyunsplash.data.scenes.photos.api.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.hyejeanmoon.wallpaperbyunsplash.domain.scenes.photos.entity.Likes

class LikesItem : Likes {

    @Expose
    @SerializedName("total")
    override val total: Int? = null

    @Expose
    @SerializedName("historical")
    override val historical: HistoricalItem? = null
}