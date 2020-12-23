package com.example.newsapp.ui.components.holders.mainpage

import android.view.View
import androidx.databinding.ViewDataBinding
import com.example.newsapp.data.components.network.repository.news.model.Article
import com.example.newsapp.databinding.NewsCardviewBinding
import com.example.newsapp.ui.components.holders.base.BaseViewHolder

class NewsViewHolder(binding: ViewDataBinding, var article: Article) :
    BaseViewHolder(binding), View.OnClickListener {

    override fun bindItem() {
        (binding as NewsCardviewBinding).article = article
        binding.executePendingBindings()
        binding.root.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        listener.onItemClick(article, p0!!)
    }
}