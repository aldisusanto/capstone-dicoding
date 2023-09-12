package com.next.up.code.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.databinding.ItemGalleryBinding
import com.next.up.code.core.domain.model.GalleryTouristAttraction
import com.squareup.picasso.Picasso

class GalleryAdapter :
    ListAdapter<GalleryTouristAttraction, GalleryAdapter.ViewHolder>(diffCallback) {

    inner class ViewHolder(private val binding: ItemGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(galleryItem: GalleryTouristAttraction) {

            with(binding) {
                Picasso.get()
                    .load(galleryItem.image)
                    .into(carouselImageView)
                tvName.text = galleryItem.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemGalleryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<GalleryTouristAttraction>() {
            override fun areItemsTheSame(
                oldItem: GalleryTouristAttraction,
                newItem: GalleryTouristAttraction
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: GalleryTouristAttraction,
                newItem: GalleryTouristAttraction
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}
