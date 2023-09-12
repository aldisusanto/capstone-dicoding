package com.next.up.code.core.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.R
import com.next.up.code.core.databinding.ItemTicketsBinding
import com.next.up.code.core.domain.model.Ticket
import com.next.up.code.core.utils.Utils.withCurrencyFormat

class TicketAdapter : ListAdapter<Ticket, TicketAdapter.ViewHolder>(diffCallback) {

    inner class ViewHolder(private val binding: ItemTicketsBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(ticketItem: Ticket) {
            with(binding) {
                if (ticketItem.category == "Dewasa") {
                    tvCategory.text = itemView.resources.getString(R.string.text_mature)
                } else {
                    tvCategory.text = itemView.resources.getString(R.string.text_child)
                }

                if (ticketItem.originCategory == "Mancanegara") {
                    tvFrom.text = itemView.resources.getString(R.string.text_abroad)
                } else {
                    tvFrom.text = itemView.resources.getString(R.string.text_domestic)
                }

                tvPrice.text = ticketItem.price.withCurrencyFormat()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemTicketsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<Ticket>() {
            override fun areItemsTheSame(oldItem: Ticket, newItem: Ticket): Boolean {
                return oldItem.id == newItem.id // Ganti dengan properti unik yang Anda miliki
            }

            override fun areContentsTheSame(oldItem: Ticket, newItem: Ticket): Boolean {
                return oldItem == newItem
            }
        }
    }
}
