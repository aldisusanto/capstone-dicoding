package com.next.up.code.core.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.next.up.code.core.R
import com.next.up.code.core.databinding.ItemTicketsBinding
import com.next.up.code.core.domain.model.Ticket
import com.next.up.code.core.utils.Utils.withCurrencyFormat

class TicketAdapter : RecyclerView.Adapter<TicketAdapter.ViewHolder>() {
    private var listItem = ArrayList<Ticket>()


    @SuppressLint("NotifyDataSetChanged")
    fun setData(newTicket: List<Ticket>?) {
        if (newTicket == null) return
        listItem.clear()
        listItem.addAll(newTicket)
        notifyDataSetChanged()
    }


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
        val data = listItem[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listItem.size

}