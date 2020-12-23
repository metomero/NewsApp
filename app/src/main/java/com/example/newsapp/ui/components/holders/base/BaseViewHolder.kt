package com.example.newsapp.ui.components.holders.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.example.newsapp.ui.components.listeners.ItemOnClickListener

abstract class BaseViewHolder(var binding : ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
    lateinit var listener : ItemOnClickListener

    abstract fun bindItem()

    open fun setItemClickListener(listener : ItemOnClickListener): BaseViewHolder {
        this.listener = listener
        return this
    }
}