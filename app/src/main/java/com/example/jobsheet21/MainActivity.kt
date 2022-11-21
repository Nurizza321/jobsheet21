package com.example.jobsheet21

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val list = ArrayList<Nama>()
    val listNama = arrayOf(
        "Muhammad Huda Gunawan",
        "Mutmainah Septiarini",
        "Nasywa Sukria Hanifa",
        "Nor Hidayah Fitriyani",
        "Novita Sari",
        "Nur Izza",
        "Riska Anggun Angriani",
        "Sahrul Lukman Hakim",
        "Setya Neng Rahayu",
        "Siti Agnia Amalia",
        "Tiara Bintang Liswanda",
    )
    lateinit var namaView: RecyclerView
    lateinit var namaAdapter: NamaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        namaView = findViewById(R.id.namaView)
        namaView.layoutManager = LinearLayoutManager(this)

        for (i in listNama.indices) {
            list.add(Nama(listNama[i]))
        }

        namaAdapter = NamaAdapter(list)
        namaAdapter.notifyDataSetChanged()
        namaView.adapter = namaAdapter
    }
}