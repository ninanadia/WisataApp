package com.ninanadia.wisataapp

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Wisata(
    var place: String = "",
    var location: String = "",
    var price: String = "",
    var detail: String = "",
    var photo: Int = 0 ,
) : Parcelable
