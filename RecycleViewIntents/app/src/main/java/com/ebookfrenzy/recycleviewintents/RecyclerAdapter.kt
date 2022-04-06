package com.ebookfrenzy.recycleviewintents

import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import androidx.core.content.ContextCompat.startActivity

class RecyclerAdapter(
    private val Titles: List<Int>,
    private val Details: List<Int>,
    private val Images: List<Int>
) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        viewHolder.itemTitle.text = Data.titles[Titles[i]]
        viewHolder.itemDetail.text = Data.details[Details[i]]
        viewHolder.itemImage.setImageResource(Data.images[Images[i]])
    }

    override fun getItemCount(): Int {
        return Data.titles.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.itemImage)
            itemTitle = itemView.findViewById(R.id.itemTitle)
            itemDetail = itemView.findViewById(R.id.itemDetail)


            itemView.setOnClickListener { v: View ->
                val i = Intent(v.context, MainActivity2::class.java)

                i.putExtra("Title", Titles[adapterPosition])
                i.putExtra("Detail", Details[adapterPosition])
                i.putExtra("Image", Images[adapterPosition])
                startActivity(v.context, i, null)
            }
        }
    }
}
