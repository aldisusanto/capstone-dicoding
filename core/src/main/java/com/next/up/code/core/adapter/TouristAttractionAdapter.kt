package com.next.up.code.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.databinding.ItemTouristAttractionBinding
import com.next.up.code.core.domain.model.TouristAttraction
import com.squareup.picasso.Picasso

class TouristAttractionAdapter :
    ListAdapter<TouristAttraction, TouristAttractionAdapter.ViewHolder>(diffCallback) {

    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ViewHolder(private val binding: ItemTouristAttractionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(touristAttractionItem: TouristAttraction) {
            binding.root.setOnClickListener {
                onItemClickCallback?.onItemClicked(touristAttractionItem)
            }
            with(binding) {
                tvObjectName.text = touristAttractionItem.touristAttractionName
                tvAddress.text = touristAttractionItem.districtName
                Picasso.get().load(touristAttractionItem.image).into(binding.ivThumbnail)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemTouristAttractionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    interface OnItemClickCallback {
        fun onItemClicked(touristAttractionItem: TouristAttraction)
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<TouristAttraction>() {
            override fun areItemsTheSame(
                oldItem: TouristAttraction,
                newItem: TouristAttraction
            ): Boolean {
                return oldItem.touristAttractionId == newItem.touristAttractionId // Ganti dengan properti unik yang Anda miliki
            }

            override fun areContentsTheSame(
                oldItem: TouristAttraction,
                newItem: TouristAttraction
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}
