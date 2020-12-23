package com.example.newsapp.data.components.network.repository.news.model

import com.example.newsapp.data.components.network.repository.news.base.constant.ModelConstants
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Article(
    @SerializedName(ModelConstants.ArticleConstants.AUTHOR)
    val author: String?,
    @SerializedName(ModelConstants.ArticleConstants.CONTENT)
    val content: String?,
    @SerializedName(ModelConstants.ArticleConstants.DESCRIPTION)
    val description: String?,
    @SerializedName(ModelConstants.ArticleConstants.PUBLISHED_AT)
    val publishedAt: String?,
    @SerializedName(ModelConstants.ArticleConstants.SOURCE)
    val source: Source?,
    @SerializedName(ModelConstants.ArticleConstants.TITLE)
    val title: String?,
    @SerializedName(ModelConstants.ArticleConstants.URL)
    val url: String?,
    @SerializedName(ModelConstants.ArticleConstants.URL_TO_IMAGE)
    val urlToImage: String?
) : Serializable