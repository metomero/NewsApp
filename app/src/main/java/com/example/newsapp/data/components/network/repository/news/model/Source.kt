package com.example.newsapp.data.components.network.repository.news.model

import com.example.newsapp.data.components.network.repository.news.base.constant.ModelConstants
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Source(
    @SerializedName(ModelConstants.SourceConstants.ID)
    val id: String,
    @SerializedName(ModelConstants.SourceConstants.NAME)
    val name: String
): Serializable{
    override fun toString(): String {
        return name
    }
}