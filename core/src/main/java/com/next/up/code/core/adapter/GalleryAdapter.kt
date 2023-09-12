package com.next.up.code.core.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.databinding.ItemGalleryBinding
import com.next.up.code.core.domain.model.GalleryTouristAttraction
import com.squareup.picasso.Picasso

class GalleryAdapter : RecyclerView.Adapter<GalleryAdapter.ViewHolder>() {
    private var listItem = ArrayList<GalleryTouristAttraction>()

    @SuppressLint("NotifyDataSetChanged")
    fun setData(newGalleryTouristAttraction: List<GalleryTouristAttraction>?) {
        if (newGalleryTouristAttraction == null) return
        listItem.clear()
        listItem.addAll(newGalleryTouristAttraction)
        notifyDataSetChanged()
    }


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
        val data = listItem[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listItem.size

}