package com.example.newsapp.data.components.network.modules

import com.example.newsapp.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {
    @Provides
    @Singleton
    fun provideNewsRetrofitService(): Retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.NEWS_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}