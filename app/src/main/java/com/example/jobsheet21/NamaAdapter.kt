package com.example.jobsheet21

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class NamaAdapter(private val list: ArrayList<Nama>): RecyclerView.Adapter<NamaAdapter.NamaViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamaViewHolder {
        return NamaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list, parent, false))

    }
    override fun onBindViewHolder(holder: NamaViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class NamaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val nama = itemView.findViewById<TextView>(R.id.namaView)
        fun bind(get: Nama) {
            nama.text = get.nama
        }
    }
}