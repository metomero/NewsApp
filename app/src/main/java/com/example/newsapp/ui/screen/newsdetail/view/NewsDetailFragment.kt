package com.example.newsapp.ui.screen.newsdetail.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.newsapp.R
import com.example.newsapp.databinding.FragmentNewsDetailBinding
import com.example.newsapp.ui.base.BaseFragment
import com.example.newsapp.ui.screen.newsdetail.viewmodel.NewsDetailFragmentViewModel
import kotlinx.android.synthetic.main.activity_main.*


class NewsDetailFragment : BaseFragment<NewsDetailFragmentViewModel, FragmentNewsDetailBinding>() {

    private fun initialize() {
        initData()
    }

    private fun initData() {
        setViewModel()

        arguments?.let {
            viewModel.currentArticle = NewsDetailFragmentArgs.fromBundle(it).article
            binding.articleDetail = viewModel.currentArticle
        }

        binding.newsUrl.setOnClickListener {
            goToLink((it as TextView).text.toString())
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_detail, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    override fun setViewModel() {
        viewModel = viewModels<NewsDetailFragmentViewModel>().value
    }

    private fun goToLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        val chooser = Intent.createChooser(
            intent,
            requireContext().getString(R.string.choose_application_message)
        )
        startActivity(chooser)
    }
}