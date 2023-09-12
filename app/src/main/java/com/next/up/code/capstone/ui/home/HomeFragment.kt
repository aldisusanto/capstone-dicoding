package com.next.up.code.capstone.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.gson.Gson
import com.inyongtisto.myhelper.base.BaseFragment
import com.next.up.code.capstone.databinding.FragmentHomeBinding
import com.next.up.code.capstone.ui.detail.DetailTouristAttractionActivity
import com.next.up.code.core.adapter.TouristAttractionAdapter
import com.next.up.code.core.data.Resource
import com.next.up.code.core.domain.model.TouristAttraction
import com.next.up.code.core.utils.Utils
import com.next.up.code.core.utils.Utils.setupRecycleView
import org.koin.androidx.viewmodel.ext.android.viewModel
import java.util.Locale


class HomeFragment : BaseFragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding
    private var root: View? = null

    private val viewModel: HomeViewModel by viewModel()
    private var filterAttractionItem = ArrayList<TouristAttraction>()
    private var attractionItems = ArrayList<TouristAttraction>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(layoutInflater)
        root = binding?.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTouristAttraction()
        setupSearch()
    }

    private fun setTouristAttraction() {
        val touristAttractionAdapter = TouristAttractionAdapter()
        viewModel.getTouristAttraction.observe(viewLifecycleOwner) { responseData ->
            when (responseData) {
                is Resource.Success -> {
                    progress.dismiss()
                    val response = responseData.data
                    touristAttractionAdapter.setData(response)
                    attractionItems.addAll(response!!)
                }

                is Resource.Loading -> {

                    progress.show()
                }

                is Resource.Error -> {
                    progress.dismiss()
                }
            }
        }

        setupRecycleView(touristAttractionAdapter, binding?.rvTouristAttraction, requireContext())
        setupListener(touristAttractionAdapter)
    }

    private fun setupSearch() {
        binding?.searchBar?.setOnQueryTextListener(object :
            androidx.appcompat.widget.SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String): Boolean {
                return false
            }

            override fun onQueryTextChange(query: String): Boolean {
                searchTouristAttraction(query)
                return true
            }
        })
    }

    private fun searchTouristAttraction(keyword: String) {
        val touristAttractionAdapter = TouristAttractionAdapter()
        filterAttractionItem.clear()

        for (attractionItem in attractionItems) {
            val attractionName = attractionItem.touristAttractionName.trim { it.isWhitespace() }
                .lowercase(Locale.getDefault())
            val cleanedAttractionName = attractionName.replace("\\s+".toRegex(), "")
            val cleanedKeyword = keyword.trim().lowercase(Locale.getDefault())

            if (cleanedAttractionName.contains(cleanedKeyword)) {
                filterAttractionItem.add(attractionItem)
            }
        }

        touristAttractionAdapter.setData(filterAttractionItem)
        setupRecycleView(touristAttractionAdapter, binding?.rvTouristAttraction, requireContext())
        setupListener(touristAttractionAdapter)
    }

    private fun setupListener(adapter: TouristAttractionAdapter) {
        adapter.setOnItemClickCallback(object :
            TouristAttractionAdapter.OnItemClickCallback {
            override fun onItemClicked(touristAttractionItem: TouristAttraction) {
                val json = Gson().toJson(touristAttractionItem, TouristAttraction::class.java)
                Utils.navigateToAnotherActivityWithData(
                    requireContext(), DetailTouristAttractionActivity::class.java, data = json
                )
            }
        })

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
