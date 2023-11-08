package com.example.google_play_store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val arrayList: ArrayList<GroupApp> = arrayListOf()

        repeat(10) {
            val arrayAppList: ArrayList<App> = arrayListOf()
            repeat(10) {
                arrayAppList.add(
                    App(
                        logoPath = "https://play-lh.googleusercontent.com/uJxoDY7gP76P1vjAFfo1nGFZBYRGYtBDTxv0OrkP_4a1x7ZpO7gC5AF2xR6qj-WVefY=w240-h480-rw",
                        title = "eHust",
                        rate = 5.0
                    )
                )
            }
            arrayList.add(GroupApp(title = "Popular apps", appList = arrayAppList))
        }

        findViewById<RecyclerView>(R.id.rvlMain).apply {
            adapter = GroupAppAdapter(arrayList)
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        }
    }
}