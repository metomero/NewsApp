package com.example.newsapp.ui.components.model.sectionitem

import android.view.ViewGroup
import com.example.newsapp.ui.components.holders.base.BaseViewHolder


abstract class SectionItem {
    var itemType: ItemType? = null
    var layout: Int? = null

    abstract fun getHolder(viewGroup: ViewGroup): BaseViewHolder
    abstract fun getItem(): Any

    enum class ItemType {
        NEWS
    }
}