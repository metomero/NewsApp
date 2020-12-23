package com.example.newsapp.ui.screen.newsdetail.viewmodel

import com.example.newsapp.data.components.network.repository.news.model.Article
import com.example.newsapp.ui.base.BaseViewModel

class NewsDetailFragmentViewModel : BaseViewModel() {
    var currentArticle: Article? = null
}