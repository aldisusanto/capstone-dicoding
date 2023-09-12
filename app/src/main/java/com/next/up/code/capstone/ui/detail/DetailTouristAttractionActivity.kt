package com.next.up.code.capstone.ui.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import com.google.android.material.carousel.CarouselLayoutManager
import com.google.gson.Gson
import com.inyongtisto.myhelper.base.BaseActivity
import com.next.up.code.capstone.databinding.ActivityDetailTouristAttractionBinding
import com.next.up.code.core.adapter.GalleryAdapter
import com.next.up.code.core.adapter.RentAdapter
import com.next.up.code.core.adapter.TicketAdapter
import com.next.up.code.core.data.Resource
import com.next.up.code.core.domain.model.TouristAttraction
import com.next.up.code.core.utils.Utils
import com.next.up.code.core.utils.Utils.setupRecycleView
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import com.squareup.picasso.Picasso
import org.koin.androidx.viewmodel.ext.android.viewModel


class DetailTouristAttractionActivity : BaseActivity() {
    private var _binding: ActivityDetailTouristAttractionBinding? = null
    private val binding get() = _binding
    private var root: View? = null

    private val viewModel: DetailViewModel by viewModel()
    private var youTubePlayer: YouTubePlayerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityDetailTouristAttractionBinding.inflate(layoutInflater)
        root = binding?.root
        setContentView(root)
        youTubePlayer = binding?.youTubePlayerView
        val json = intent?.getStringExtra("data")
        val touristAttractionItem = Gson().fromJson(json, TouristAttraction::class.java)
        val touristAttractionId = touristAttractionItem.touristAttractionId
        setupMainButton(touristAttractionItem)
        setTouristAttraction(touristAttractionItem)
        setTicket(touristAttractionId)
        setRent(touristAttractionId)
        setVideo(touristAttractionId)
        setGallery(touristAttractionId)
    }

    private fun setupMainButton(touristAttractionItem: TouristAttraction) {
        binding?.apply {
            btnBack.setOnClickListener {
                onBackPressed()
            }

            btnMaps.setOnClickListener {
                val gmmIntentUri =
                    Uri.parse("google.navigation:q=${touristAttractionItem.latitude}, ${touristAttractionItem.longitude}")
                val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
                mapIntent.setPackage("com.google.android.apps.maps")
                startActivity(mapIntent)
            }
        }
    }

    private fun setTouristAttraction(touristAttraction: TouristAttraction) {
        binding?.apply {
            tvTouristAttractionName.text = touristAttraction.touristAttractionName
            tvAddress.text = touristAttraction.address
            Picasso.get().load(touristAttraction.image).into(ivCover)


            var statusFavorite = touristAttraction.isFavorite
            setFavorite(statusFavorite)
            binding?.btnFavorite?.setOnClickListener {
                statusFavorite = !statusFavorite
                viewModel.setFavoriteTouristAttraction(touristAttraction, statusFavorite)
                setFavorite(statusFavorite)
            }
        }

    }

    private fun setTicket(id: Int) {
        val ticketAdapter = TicketAdapter()
        viewModel.getTicket(id).observe(this) { responseData ->
            when (responseData) {
                is Resource.Success -> {
                    progress.dismiss()
                    val response = responseData.data
                    ticketAdapter.submitList(response)
                    binding?.apply {
                        if (response?.isEmpty() == true) {
                            binding?.rvTicket?.visibility = View.GONE
                            binding?.tvTitlePriceTicket?.visibility = View.GONE
                        } else {
                            binding?.rvTicket?.visibility = View.VISIBLE
                            binding?.tvTitlePriceTicket?.visibility = View.VISIBLE
                        }
                    }
                }

                is Resource.Loading -> {
                    Log.d("TicketFragment", "Resource.Loading")
                    progress.show()
                }

                is Resource.Error -> {
                    progress.dismiss()
                }
            }
        }
        setupRecycleView(ticketAdapter, binding?.rvTicket, this)
    }

    private fun setRent(id: Int) {
        val rentAdapter = RentAdapter()
        viewModel.getRent(id).observe(this) { responseData ->
            when (responseData) {
                is Resource.Success -> {
                    progress.dismiss()
                    val response = responseData.data
                    rentAdapter.submitList(response)
                    binding?.apply {
                        if (response?.isEmpty() == true) {
                            binding?.tvTitlePricePlace?.visibility = View.GONE
                            binding?.llHeaderRent?.visibility = View.GONE
                            binding?.rvPlace?.visibility = View.GONE
                        } else {
                            binding?.tvTitlePricePlace?.visibility = View.VISIBLE
                            binding?.llHeaderRent?.visibility = View.VISIBLE
                            binding?.rvPlace?.visibility = View.VISIBLE
                        }
                    }
                }

                is Resource.Loading -> {
                    progress.show()
                }

                is Resource.Error -> {
                    progress.dismiss()
                }
            }
        }
        setupRecycleView(rentAdapter, binding?.rvPlace, this)
    }

    private fun setVideo(id: Int) {
        viewModel.getVideo(id).observe(this) { responseData ->
            when (responseData) {
                is Resource.Success -> {
                    progress.dismiss()
                    val response = responseData.data
                    if (response != null) {
                        val videoUrl = response.link
                        val videoId = Utils.getVideoIdFromYoutubeUrl(videoUrl)

                        youTubePlayer?.addYouTubePlayerListener(object :
                            AbstractYouTubePlayerListener() {
                            override fun onReady(youTubePlayer: YouTubePlayer) {
                                youTubePlayer.loadVideo(videoId, 0f)
                            }
                        })
                    }
                }

                is Resource.Loading -> {
                    progress.show()
                }

                is Resource.Error -> {
                    progress.dismiss()
                }
            }
        }
    }

    private fun setGallery(id: Int) {
        val galleryAdapter = GalleryAdapter()
        viewModel.getGallery(id).observe(this) { responseData ->
            when (responseData) {
                is Resource.Success -> {
                    progress.dismiss()
                    val response = responseData.data
                    galleryAdapter.submitList(response)
                }

                is Resource.Loading -> {
                    progress.show()
                }

                is Resource.Error -> {
                    progress.dismiss()
                }

            }
        }
        with(binding?.rvGallery) {
            this?.adapter = galleryAdapter
            this?.layoutManager = CarouselLayoutManager()
            this?.setHasFixedSize(true)
        }
    }

    private fun setFavorite(isFavorite: Boolean) {
        binding?.btnFavorite?.isChecked = isFavorite
    }

    override fun onDestroy() {
        super.onDestroy()
        Picasso.get().cancelRequest(binding!!.ivCover)
        youTubePlayer?.release()
        youTubePlayer = null
        _binding = null
    }


}