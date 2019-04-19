package com.example.mahmoud_ashraf.koraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mahmoud_ashraf.koraapp.adapters.MainPagerAdapter
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)

        vpMain.adapter = MainPagerAdapter(supportFragmentManager)
        btmNavMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.matches -> vpMain.setCurrentItem(0, false)
                R.id.teams -> vpMain.setCurrentItem(1, false)
                R.id.favorites -> vpMain.setCurrentItem(2, false)
            }
            true
        }
    }
}
