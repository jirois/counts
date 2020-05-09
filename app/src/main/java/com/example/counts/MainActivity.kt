package com.example.counts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.counts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val myName: NameHolder = NameHolder("Jirios")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        binding.nameHolder = myName


        binding.button.setOnClickListener {
            setView(it)
        }

        binding.txRead.setOnClickListener {
            editView(it)
        }

    }

    fun setView(v: View){
        binding.apply {
            txRead.text = editText.text
            editText.visibility = View.GONE
            button.visibility = View.GONE
            txRead.visibility = View.VISIBLE
        }

    }

    fun editView(v: View){
        binding.apply {
           txRead.visibility = View.GONE
            editText.visibility = View.VISIBLE
           button.visibility = View.VISIBLE
        }

    }
}
