package com.example.newsapp.data.components.network.repository.news.sources

import com.example.newsapp.data.components.network.repository.news.api.NewsApi
import com.example.newsapp.data.components.network.repository.news.model.NewsResponse
import retrofit2.Callback
import javax.inject.Inject

class NewsSource @Inject constructor(var newsService : NewsApi) {
    fun getNews(callback: Callback<NewsResponse>){
        newsService.getNews().enqueue(callback)
    }
}