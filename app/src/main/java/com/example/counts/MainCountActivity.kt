package com.example.counts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.example.counts.databinding.ActivityMainCountBinding

class MainCountActivity : AppCompatActivity() {
    lateinit var drawerLayout:DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainCountBinding>(this,R.layout.activity_main_count)

        drawerLayout = binding.drawerLayout

        val navAppController = this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this, navAppController, drawerLayout)
        NavigationUI.setupWithNavController(binding.navView, navAppController)


    }

    override fun onSupportNavigateUp(): Boolean {
        val navAppController = this.findNavController(R.id.myNavHostFragment)
        return NavigationUI.navigateUp(navAppController, drawerLayout)

    }
}
