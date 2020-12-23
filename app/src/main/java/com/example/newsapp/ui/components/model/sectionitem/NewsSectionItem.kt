package com.example.newsapp.ui.components.model.sectionitem

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.newsapp.R
import com.example.newsapp.data.components.network.repository.news.model.Article
import com.example.newsapp.databinding.NewsCardviewBinding
import com.example.newsapp.ui.components.holders.base.BaseViewHolder
import com.example.newsapp.ui.components.holders.mainpage.NewsViewHolder


class NewsSectionItem(var article: Article) :
    SectionItem() {

    init {
        itemType = ItemType.NEWS
        this.layout = R.layout.news_cardview
    }

    override fun getHolder(viewGroup: ViewGroup): BaseViewHolder {
        val inflater = LayoutInflater.from(viewGroup.context)
        val binding = NewsCardviewBinding.inflate(inflater, viewGroup, false)
        return NewsViewHolder(binding, article)
    }

    override fun getItem(): Any {
        return article
    }
}