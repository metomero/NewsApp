package com.example.newsapp.ui.components.model.section

import android.view.ViewGroup
import com.example.newsapp.ui.components.model.sectionitem.SectionItem
import com.example.newsapp.ui.components.holders.base.BaseViewHolder


abstract class Section {

    lateinit var sectionType : SectionType
    var item : SectionItem? = null

    abstract fun getHolder(viewGroup: ViewGroup, position : Int): BaseViewHolder

    enum class SectionType{
        LIST
    }
}