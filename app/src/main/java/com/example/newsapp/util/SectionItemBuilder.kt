package com.example.newsapp.util

import com.example.newsapp.R
import com.example.newsapp.data.components.network.repository.news.model.Article
import com.example.newsapp.ui.components.model.section.ListSection
import com.example.newsapp.ui.components.model.sectionitem.NewsSectionItem

class SectionItemBuilder {
    companion object {
        fun getNewsSectionList(articles: List<Article>): ArrayList<ListSection> {
            val sectionItemList = arrayListOf<ListSection>()

            for(article in articles){
                sectionItemList.add(ListSection().addItem(NewsSectionItem(article)))
            }

            return sectionItemList
        }
    }
}