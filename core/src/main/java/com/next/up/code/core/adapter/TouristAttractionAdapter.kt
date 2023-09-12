package com.next.up.code.core.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.databinding.ItemTouristAttractionBinding
import com.next.up.code.core.domain.model.TouristAttraction
import com.squareup.picasso.Picasso

class TouristAttractionAdapter :
    RecyclerView.Adapter<TouristAttractionAdapter.ViewHolder>() {
    private var listItem = ArrayList<TouristAttraction>()
    private var onItemClickCallback: OnItemClickCallback? = null


    @SuppressLint("NotifyDataSetChanged")
    fun setData(newListItem: List<TouristAttraction>?) {
        if (newListItem == null) return
        listItem.clear()
        listItem.addAll(newListItem)
        notifyDataSetChanged()
    }

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
        val data = listItem[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listItem.size

    interface OnItemClickCallback {
        fun onItemClicked(touristAttractionItem: TouristAttraction)
    }
}