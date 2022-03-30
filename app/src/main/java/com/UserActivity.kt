package com

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.ninanadia.wisataapp.R

class UserActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_USER = "extra_user"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_IMAGE = "extra_image"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val actionbar = supportActionBar
        actionbar!!.title = "About"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val tvImageReceived: ImageView = findViewById(R.id.img_user_photo)
        val tvUserReceived: TextView = findViewById(R.id.tv_user_received)
        val tvEmailReceived: TextView = findViewById(R.id.tv_email_received)

        val picture = intent.getIntExtra(EXTRA_IMAGE, 0)
        val user = intent.getStringExtra(EXTRA_USER)
        val email = intent.getStringExtra(EXTRA_EMAIL)

        val userText = "$user"
        val emailText = "$email"
        val pictureImage = "$picture"

        tvUserReceived.text = user
        tvEmailReceived.text = email
        tvImageReceived.setImageResource(picture)
    }


    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}

