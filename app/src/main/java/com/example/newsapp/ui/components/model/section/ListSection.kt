package com.example.newsapp.ui.components.model.section

import android.view.ViewGroup
import com.example.newsapp.ui.components.holders.base.BaseViewHolder
import com.example.newsapp.ui.components.model.sectionitem.SectionItem

class ListSection : Section() {

    init {
        sectionType = SectionType.LIST
    }

    override fun getHolder(viewGroup: ViewGroup, position: Int): BaseViewHolder {
        return item!!.getHolder(viewGroup)
    }

    fun addItem(listItem: SectionItem): ListSection {
        item = listItem
        return this
    }

}