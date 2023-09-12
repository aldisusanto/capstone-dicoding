package com.next.up.code.core.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.databinding.ItemRentBinding
import com.next.up.code.core.domain.model.Rent
import com.next.up.code.core.utils.Utils.withCurrencyFormat

class RentAdapter : RecyclerView.Adapter<RentAdapter.ViewHolder>() {
    private var listItem = ArrayList<Rent>()


    @SuppressLint("NotifyDataSetChanged")
    fun setData(newRent: List<Rent>?) {
        if (newRent == null) return
        listItem.clear()
        listItem.addAll(newRent)
        notifyDataSetChanged()
    }

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
        val data = listItem[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listItem.size

}