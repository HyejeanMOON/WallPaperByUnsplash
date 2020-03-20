package com.hyejeanmoon.wallpaperbyunsplash.data.scenes.photos.api.entity

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import com.hyejeanmoon.wallpaperbyunsplash.domain.scenes.photos.entity.Tags

class TagsItem : Tags {
    @Expose
    @SerializedName("title")
    override val title: String? = null
}