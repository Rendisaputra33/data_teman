package com.example.data_teman

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val texts = arrayOf("Teman", "Github", "Profile")
    private val icons = arrayOf(R.drawable.ic_house, R.drawable.ic_add, R.drawable.ic_profile)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPagerAdapter(this)
        view_pagger.adapter = adapter

        TabLayoutMediator(tab_layout, view_pagger) { tab, position ->
            tab.text = texts[position]
            tab.icon = ResourcesCompat.getDrawable(resources, icons[position], null)
        }.attach()
    }
}