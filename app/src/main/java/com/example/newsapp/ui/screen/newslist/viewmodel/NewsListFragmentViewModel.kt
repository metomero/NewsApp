package com.example.newsapp.ui.screen.newslist.viewmodel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import com.example.newsapp.R
import com.example.newsapp.application.MainApplication
import com.example.newsapp.data.components.network.repository.news.model.NewsResponse
import com.example.newsapp.data.components.network.repository.news.sources.NewsSource
import com.example.newsapp.ui.base.BaseViewModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

class NewsListFragmentViewModel @ViewModelInject constructor(var newsSource : NewsSource): BaseViewModel() {
    var newsResponse = MutableLiveData<NewsResponse?>(null)

    private var newsCallback = object : Callback<NewsResponse> {
        var categoryName = MainApplication.appContext.getString(R.string.newsCategoryName)

        override fun onResponse(
            call: Call<NewsResponse>,
            response: Response<NewsResponse>
        ) {
            if (response.isSuccessful) {
                newsResponse.value = response.body()
            }
        }

        override fun onFailure(
            call: Call<NewsResponse>,
            t: Throwable
        ) {
            errorMessage.value =
                MainApplication.appContext.getString(R.string.error_messages, categoryName)
        }
    }

    fun getNews(){
        newsSource.getNews(newsCallback)
        //NetworkModule.getNews(newsCallback)
    }
}