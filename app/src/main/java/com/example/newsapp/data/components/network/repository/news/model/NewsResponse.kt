package com.example.newsapp.data.components.network.repository.news.model

import com.example.newsapp.data.components.network.repository.news.base.constant.ModelConstants
import com.google.gson.annotations.SerializedName

data class NewsResponse(
    @SerializedName(ModelConstants.NewsConstants.ARTICLES)
    val articles: List<Article>,
    @SerializedName(ModelConstants.NewsConstants.STATUS)
    val status: String,
    @SerializedName(ModelConstants.NewsConstants.TOTAL_RESULTS)
    val totalResults: Int
)