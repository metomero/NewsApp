package com.example.newsapp.ui.screen.newslist.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.newsapp.R
import com.example.newsapp.data.components.network.repository.news.model.Article
import com.example.newsapp.databinding.FragmentNewsListBinding
import com.example.newsapp.ui.base.BaseFragment
import com.example.newsapp.ui.components.adapters.base.BaseListAdapter
import com.example.newsapp.ui.components.listeners.ItemOnClickListener
import com.example.newsapp.ui.screen.newslist.viewmodel.NewsListFragmentViewModel
import com.example.newsapp.util.SectionItemBuilder
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewsListFragment : BaseFragment<NewsListFragmentViewModel, FragmentNewsListBinding>(),
    ItemOnClickListener {

    private fun initControls() {

    }

    private fun initialize() {
        initControls()
        initData()

        if(viewModel.newsResponse.value == null) {
            viewModel.getNews()
        }
    }

    private fun initData() {
        setViewModel()
        binding.run {
            newsRecyclerView.layoutManager =
                LinearLayoutManager(
                    requireView().context,
                    LinearLayoutManager.VERTICAL,
                    false
                )

            refresher.setOnRefreshListener {
                viewModel.getNews()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_news_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()

        registerLiveData()
    }

    override fun setViewModel() {
        viewModel = viewModels<NewsListFragmentViewModel>().value
    }

    override fun registerLiveData() {
        super.registerLiveData()

        viewModel.newsResponse.observe(viewLifecycleOwner, {
            it?.let {
                initRecyclerView(it.articles)
                binding.refresher.isRefreshing = false
            }
        })
    }

    private fun initRecyclerView(articles: List<Article>) {
        binding.run {
            newsRecyclerView.adapter = BaseListAdapter(
                SectionItemBuilder.getNewsSectionList(articles),
                this@NewsListFragment
            )
            (newsRecyclerView.adapter as BaseListAdapter).notifyDataSetChanged()
        }
    }

    override fun onItemClick(item: Article, view: View) {
        val action =
            NewsListFragmentDirections.actionMainFragmentToNewsDetailFragment(item)
        Navigation.findNavController(requireView()).navigate(action)
    }
}