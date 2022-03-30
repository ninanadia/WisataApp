package com.ninanadia.wisataapp

import android.content.Intent
import android.icu.text.Transliterator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.DetailWisataActivity
import com.UserActivity

class MainActivity : AppCompatActivity() {
    private lateinit var rvWisata: RecyclerView
    private var list: ArrayList<Wisata> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        rvWisata = findViewById(R.id.rv_wisata)
        rvWisata.setHasFixedSize(true)
        list.addAll(WisataData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvWisata.layoutManager = LinearLayoutManager(this)
        val listWisataAdapter = ListWisataAdapter(list)
        rvWisata.adapter = listWisataAdapter

        listWisataAdapter.setOnItemClickCallback(object:ListWisataAdapter.OnItemClickCallback{
            override fun onItemClickedData(data: Wisata) {
                showSelectedWisata(data)
            }
        })
    }

    private fun showSelectedWisata(data: Wisata) {
        val detailWisataActivity = Intent(this@MainActivity, DetailWisataActivity::class.java).apply {
            putExtra(DetailWisataActivity.EXTRA_PHOTO, data.photo)
            putExtra(DetailWisataActivity.EXTRA_PLACE, data.place)
            putExtra(DetailWisataActivity.EXTRA_LOCATION, data.location)
            putExtra(DetailWisataActivity.EXTRA_PRICE, data.price)
            putExtra(DetailWisataActivity.EXTRA_DETAIL, data.detail)
        }
        startActivity(detailWisataActivity)
    }

       override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(SelectedMode: Int){
        R.id.action_user;run {
            val moveIntent = Intent(this@MainActivity, UserActivity::class.java)
            moveIntent.putExtra(UserActivity.EXTRA_IMAGE, R.drawable.user)
            moveIntent.putExtra(UserActivity.EXTRA_USER, "Nina Nadia Syafitri Husein")
            moveIntent.putExtra(UserActivity.EXTRA_EMAIL, "ninanadiasyafitrihusein@gmail.com")
            startActivity(moveIntent)
        }
    }

}