package com.soutoss.facebooksnapshotsample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val listItems: List<Pair<Int, String>>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.view_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = listItems.count()

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(listItems[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val imageView = view.findViewById<ImageView>(R.id.imageView)
        private val label = view.findViewById<TextView>(R.id.label)

        fun bind(pair: Pair<Int, String>) {
            val (imageResource, text) = pair
            imageView.setImageResource(imageResource)
            label.text = text
        }

    }
}

