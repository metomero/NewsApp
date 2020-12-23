package com.example.newsapp.data.components.network.repository.news.base.modules

import retrofit2.Retrofit
import javax.inject.Inject


class BaseRetrofitService @Inject constructor(val retrofit: Retrofit) {
    inline fun <reified T> create(apiClass: Class<T>): T = retrofit.create(apiClass)
}