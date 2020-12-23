package com.example.newsapp.data.components.network.repository.news.api

import com.example.newsapp.BuildConfig
import com.example.newsapp.data.base.LocaleInfo
import com.example.newsapp.data.components.network.repository.news.base.constant.NewsAPIConstants
import com.example.newsapp.data.components.network.repository.news.model.NewsResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {
    @GET(NewsAPIConstants.TOP_HEADLINES)
    fun getNews(
        @Query(NewsAPIConstants.COUNTRY) country : String = LocaleInfo.country,
        @Query(NewsAPIConstants.API_KEY) apiKey: String = BuildConfig.NEWS_API_KEY,
    ) : Call<NewsResponse>
}