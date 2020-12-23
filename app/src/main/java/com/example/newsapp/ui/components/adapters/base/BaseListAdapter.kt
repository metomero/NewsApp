package com.example.newsapp.ui.components.adapters.base

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.ui.components.model.section.Section
import com.example.newsapp.ui.components.holders.mainpage.NewsViewHolder
import com.example.newsapp.ui.components.listeners.ItemOnClickListener

open class BaseListAdapter(
    var sectionList: List<Section>,
    var listener: ItemOnClickListener? = null
) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): RecyclerView.ViewHolder {
        return sectionList[position].getHolder(parent, position)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as NewsViewHolder).setItemClickListener(listener!!).bindItem()
    }

    override fun getItemCount(): Int {
        return sectionList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    fun updateList(newSectionList: List<Section>){
        sectionList = newSectionList
        notifyDataSetChanged()
    }

}