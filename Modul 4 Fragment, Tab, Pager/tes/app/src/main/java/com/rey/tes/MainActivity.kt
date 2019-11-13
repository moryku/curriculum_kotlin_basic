package com.rey.tes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class MainActivity : AppCompatActivity() {

    private val tabIcons =
        intArrayOf(R.drawable.ic_home_black_24dp, R.drawable.ic_search_black_24dp, R.drawable.ic_person_black_24dp)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.adapter = PagerAdapter(supportFragmentManager)

        tabLayout.setupWithViewPager(viewPager)
        setTabIcon()

    }

    private fun setTabIcon() {
        tabLayout.getTabAt(0)?.setIcon(R.drawable.ic_home_black_24dp)
        tabLayout.getTabAt(1)?.setIcon(R.drawable.ic_search_black_24dp)
        tabLayout.getTabAt(2)?.setIcon(R.drawable.ic_person_black_24dp)
    }
}
