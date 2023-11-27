package com.example.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    var toplam = 0
    var sonuc = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonAC.setOnClickListener {
            toplam = 0
            binding.textViewSonuc.text = toplam.toString()
            sonuc = ""
        }

        binding.buttonToplama.setOnClickListener {
            if (sonuc.isNotEmpty() && sonuc.last() != '+') {
                sonuc += '+'
                binding.textViewSonuc.text = sonuc
            }
        }

        binding.buttonEsittir.setOnClickListener {
            toplam = 0
            val sayilar = sonuc.split("+").toTypedArray()
            for (sayi in sayilar) {
                toplam += sayi.toInt()
            }
            sonuc = toplam.toString()
            binding.textViewSonuc.text = sonuc
        }
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.textView1 -> {
                sonuc += '1'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView2 -> {
                sonuc += '2'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView3 -> {
                sonuc += '3'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView4 -> {
                sonuc += '4'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView5 -> {
                sonuc += '5'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView6 -> {
                sonuc += '6'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView7 -> {
                sonuc += '7'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView8 -> {
                sonuc += '8'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView9 -> {
                sonuc += '9'
                binding.textViewSonuc.text = sonuc
            }
            R.id.textView10 -> {
                sonuc += '0'
                binding.textViewSonuc.text = sonuc
            }
        }
    }

}


