package com.example.newsapp.ui.components.listeners

import android.view.View
import com.example.newsapp.data.components.network.repository.news.model.Article

interface ItemOnClickListener {
    fun onItemClick(item : Article, view : View)
}