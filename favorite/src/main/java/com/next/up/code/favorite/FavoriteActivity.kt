package com.next.up.code.favorite

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import com.next.up.code.capstone.ui.detail.DetailTouristAttractionActivity
import com.next.up.code.core.adapter.TouristAttractionAdapter
import com.next.up.code.core.domain.model.TouristAttraction
import com.next.up.code.core.utils.Utils
import com.next.up.code.favorite.databinding.ActivityFavoriteBinding
import com.next.up.code.favorite.di.favoriteModule
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules

class FavoriteActivity : AppCompatActivity() {
    private var _binding: ActivityFavoriteBinding? = null
    private val binding get() = _binding
    private var root: View? = null
    private val viewModel: FavoriteViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityFavoriteBinding.inflate(layoutInflater)
        root = binding?.root
        setContentView(root)
        loadKoinModules(favoriteModule)
        setupFavoriteList()

    }

    private fun setupFavoriteList() {
        viewModel.touristAttraction.observe(this@FavoriteActivity) {
            val touristAttractionAdapter = TouristAttractionAdapter()
            touristAttractionAdapter.setData(it)
            Utils.setupRecycleView(touristAttractionAdapter, binding?.rvTouristAttraction, this)
            touristAttractionAdapter.setOnItemClickCallback(object :
                TouristAttractionAdapter.OnItemClickCallback {
                override fun onItemClicked(touristAttractionItem: TouristAttraction) {
                    val json = Gson().toJson(touristAttractionItem, TouristAttraction::class.java)
                    Utils.navigateToAnotherActivityWithData(
                        this@FavoriteActivity,
                        DetailTouristAttractionActivity::class.java,
                        data = json
                    )
                }
            })
        }

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}