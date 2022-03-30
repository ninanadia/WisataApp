package com.ninanadia.wisataapp

object WisataData {
    private val wisataPlace = arrayOf(
        "Pantai Tanjung Pakis",
        "Bendungan Walahar",
        "Pantai Samudera Baru",
        "Curug Bandung",
        "Curug Cigentis Loji",
        "Danau Cipule",
        "Goa Dayeuh",
        "Vihara Sian Djin Ku Poh",
        "Candi Jiwa Batujaya",
        "Monumen Kebulatan Tekad Rengas Dengklok"
    )

    private val wisataLocation = arrayOf(
        "Tanjung Pakis Pakis Jaya",
        "Kutapohaci Ciampel",
        "Jl.Raya Sungai Buntu Sungai buntu, Pedes",
        "Mekarbuana Tegalwaru",
        "Mekarbuana Tegalwaru",
        "Desa Walahar Ciampel",
        "Taman sari Pangkalan",
        "Jl.Muhammad Toha Tanjungmekar",
        "Segaran Batujaya",
        "Jl.Raya R.Dengklok Rengasdengklok"
    )

    private val wisataPrice = arrayOf(
        "Rp.25.000",
        "Gratis",
        "Rp.15.000(Motor), Rp.30.000(Mobil)",
        "Rp.5.000(Perorang), Rp.10.000(Motor)",
        "Rp.15.000(Perorang)",
        "Gratis",
        "Gratis",
        "Gratis",
        "Rp.10.000",
        "Gratis"
    )

    private val wisataDetails = arrayOf(
        "Pantai Tanjung Pakis merupakan salah satu wisata bahari paling terkenal di Karawang. Tersaji pemandangan beberapa tambak ikan milik warga yang dapat dilihat dari dekat oleh pengunjung. Banyak juga tempat makan yang menyadikan seafood serta lainnya.",
        "Bendungan Walahar merupakan sebuah bendungan tua yang dulunya dinamakan sebagai Bendungan Parisdo dan sudah dibangun sejak zaman penjajahan Belanda sehingga pengunjungnya dapat merasakan nuansa bangunan yang unik dengan desain zaman kolonial.",
        "Pantai ini berdekatan dengan pantai Tanjung Pakis, seperti Tanjung Pakis, panta ini memiliki warna pasir yang cokelat kehitaman dan agak gelap. Hal itu disebabkan karena banyaknya perahu nelayan yang berlabuh dan membuat tambak ikan, disini.",
        "Curug ini berada di kaki Gunung Sanggabuana, curug ini terkenal karena memiliki 7 aliran sungai kecil yang menurun dan membentuk satu air terjun. Diantaranya adalah Cigentis, Peuteuy, Cadas, Picung, Jodo, Lesung, dan Curug Bandung. Curug ini memiliki ketinggian kurang lebih 25 meter.",
        "Daerah ini memiliki perkampungan wisata keluarga dimana tersedia permainan seperti outbond, kolam renang, ATV, villa penginapan, tempat makan, dan sebagainya. perbedaan curug ini dengan curug bandung adalah lokasi akses yang lebih mudah.",
        "Destinasi wisata ini terletak tidak terlalu jauh dari Bendungan Walahar, ditengah danau ini terdapat pulau kecil yang memiliki luas sekitar 2.000 meter persegi yang disebut Pulau Cinta. untuk ke pulau tersebut, pengunjung hanya akan dikenakan biaya Rp.2000 per orang untuk menaiki perahu.",
        "Goa Dayeuh merupakan wisata alam goa yang paling populer di daerah Karawang karena bentuknya menyerupai benteng dengan ukuran 15 meter. Di sekitar spot ini sendiri terdapat sungai dari mataair alami yakni mata air Citaman yang airnya sangat jernih dan alami. Goa Dayeuh pun tidak lepas dari berbagai macam mitos dan cerita mistisnya, namun terlepas dari itu, pemandangan di sekitar goa ini patut diacungi jempol.",
        "Tempat wisata ini merupakan klenteng tertua di Jawa Barat karena dibangun sejak tahun 1770. Vihara ini masih sangat dijaga oleh biksu yang merupakan orang turun temurun dari leluhurnya sejak awal dibangun. Didalam vihara ini terdapat tempat sembahyang yang sudah berusia lebih dari 300 tahun lamanya. Uniknya, abu dari jenazah pendiri Vihara masih tersimpan dengan rapi dan utuh di altar bagian depan.",
        "Candi ini terletak di tengah-tengah areal persawahan penduduk. Bentuk candi ini seperti bunga teratai atau banyak disebut bentuk Padma pada kepercayaan Hindu-Buddha. Selain itu, Candi Jiwa ini terbentuk dari lempengan batu bata, tidak seperti candi pada umumnya yang disusun dari bebatuan. Konon candi ini merupanak salah satu tempat khusus tempat pemujaan dewa Syiwa.",
        "Monumen atau tugu ini merupakan bekas markas PETA (Pembela Tanah Air), bentuk dari monumen ini sangat unik dengan bola putih pada bagian atasnya dengan gambar 17AUG1945. Selain tugu, pengunjung dapat melihat rumah bersejarah tempat dahulu Soekarno-Hatta diamankan pada peristiwa Rengas Dengklok."
    )

    private val wisataImages = intArrayOf(
        R.drawable.tanjung_pakis,
        R.drawable.bendungan_walahar,
        R.drawable.samudera_baru,
        R.drawable.curug_bandung,
        R.drawable.curug_cigentis,
        R.drawable.danau_cipule,
        R.drawable.goa_dayeuh,
        R.drawable.vihara_sian,
        R.drawable.candi_jiwa,
        R.drawable.monumen_rengasdengklok
    )

    val listData: ArrayList<Wisata>
        get(){
            val list = arrayListOf<Wisata>()
            for (position in wisataPlace.indices){
                val wisata = Wisata()
                wisata.place = wisataPlace[position]
                wisata.location = wisataLocation[position]
                wisata.price = wisataPrice[position]
                wisata.detail = wisataDetails[position]
                wisata.photo = wisataImages[position]
                list.add(wisata)
            }
            return list
        }
}