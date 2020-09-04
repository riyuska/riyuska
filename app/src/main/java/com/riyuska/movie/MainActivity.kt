package com.riyuska.movie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var dataList = ArrayList<FilmModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_movie.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

       loadDataSample();

        rv_movie.adapter = MovieAdapter(dataList){
            val intent = Intent(this, DetailActivity::class.java)
                .putExtra("data", it)
            startActivity(intent)
        }

        textView2.setOnClickListener(){
            val intent = Intent(this, AllMovieActivity::class.java)
                .putExtra("data", dataList)
            startActivity(intent)
        }
    }

    private fun loadDataSample() {
        dataList.add(
            FilmModel(
                "1",
                "Alkhairunas Riyuska",
                "Alkhairunas Riyuska adalah seorang ksatria. pemimpin yang mengedepankan kejujuran dan adil",
                "Action",
                R.drawable.ic_ad_astra,
                R.raw.video_ektp,
                3.0F
            )
        )

        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami menambahkannya",
                "Action",
                R.drawable.ic_avengers,
                R.raw.video_android,
                4.0F
            )
        )

        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami menambahkannya",
                "Action",
                R.drawable.ic_poster_sonic,
                R.raw.video_voice,
                4.0F
            )
        )
        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami menambahkannya",
                "Action",
                R.drawable.ic_ad_astra,
                R.raw.video_mp3,
                5.0F
            )
        )

        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami menambahkannya",
                "Action",
                R.drawable.ic_poster_sonic,
                R.raw.video_a_rainy_day,
                4.0F
            )
        )

        dataList.add(
            FilmModel(
                "1",
                "A Rainy Day in New York",
                "kami belum memiliki kilasan singkat dalam bahasa indonesia. Bantu kami menambahkannya",
                "Action",
                R.drawable.ic_ad_astra,
                R.raw.video_sample,
                5.0F
            )
        )
    }
}