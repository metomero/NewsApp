package com.example.newsapp.data.components.network.modules

import com.example.newsapp.data.components.network.repository.news.api.NewsApi
import com.example.newsapp.data.components.network.repository.news.base.modules.BaseRetrofitService
import com.example.newsapp.data.components.network.repository.news.sources.NewsSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SourceModule {

    @Singleton
    @Provides
    fun provideNewsSource(service : BaseRetrofitService) = NewsSource(service.create(NewsApi::class.java))
}