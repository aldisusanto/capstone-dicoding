package com.next.up.code.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.databinding.ItemRentBinding
import com.next.up.code.core.domain.model.Rent
import com.next.up.code.core.utils.Utils.withCurrencyFormat

class RentAdapter : ListAdapter<Rent, RentAdapter.ViewHolder>(diffCallback) {

    inner class ViewHolder(private val binding: ItemRentBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(rentItem: Rent) {

            with(binding) {
                tvPlace.text = rentItem.placeName
                tvPrice.text = rentItem.price.withCurrencyFormat()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemRentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Rent>() {
            override fun areItemsTheSame(oldItem: Rent, newItem: Rent): Boolean {
                return oldItem.id == newItem.id // Ganti dengan properti unik yang Anda miliki
            }

            override fun areContentsTheSame(oldItem: Rent, newItem: Rent): Boolean {
                return oldItem == newItem
            }
        }
    }
}
