package com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.VibrationAttributes
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import com.ninanadia.wisataapp.MainActivity
import com.ninanadia.wisataapp.R
import com.ninanadia.wisataapp.Wisata
import com.ninanadia.wisataapp.WisataData


class DetailWisataActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_PLACE = "extra_place"
        const val EXTRA_LOCATION = "extra_location"
        const val EXTRA_PRICE = "extra_price"
        const val EXTRA_DETAIL = "extra_detail"
        //const val EXTRA_WISATA = "extra_wisata"
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView( R.layout.activity_detail_wisata)

        var actionBar = getSupportActionBar()
        actionBar?.setDisplayHomeAsUpEnabled(true)

        showWisataDetail()

        //val wisatas = intent.getParcelableExtra<Wisata>(MainActivity.INTENT_PARCELABLE)
        //val wisatas = intent.getParcelableArrayListExtra<Wisata>(EXTRA_WISATA)as ArrayList<Wisata>

    }

    private fun showWisataDetail(){

        val tvImageReceived: ImageView = findViewById(R.id.img_item_photo)
        val tvPlaceReceived: TextView = findViewById(R.id.tv_item_place)
        val tvLocationReceived: TextView = findViewById(R.id.tv_item_location)
        val tvPriceReceived: TextView = findViewById(R.id.tv_item_price)
        val tvDetailReceived: TextView = findViewById(R.id.tv_item_detail)

        val photo = intent.getIntExtra(DetailWisataActivity.EXTRA_PHOTO, 0)
        val place = intent.getStringExtra(DetailWisataActivity.EXTRA_PLACE)
        val location = intent.getStringExtra(DetailWisataActivity.EXTRA_LOCATION)
        val price = intent.getStringExtra(DetailWisataActivity.EXTRA_PRICE)
        val detail = intent.getStringExtra(DetailWisataActivity.EXTRA_DETAIL)

        //val placeText = "$place"
        //val locationText = "$location"
//        val priceText = "$price"
//        val detailText = "$detail"
//        val photoImage = "$photo"

        tvImageReceived.setImageResource(photo)
        tvPlaceReceived.setText("$place")
        tvLocationReceived.setText("Location: $location")
        tvPriceReceived.setText("Harga Tiket Masuk: $price")
        tvDetailReceived.setText("$detail")
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}