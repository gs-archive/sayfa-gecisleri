package com.gulsah.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_bir.buttonSayfaIki
import kotlinx.android.synthetic.main.activity_sayfa_iki.*

class SayfaIki : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_iki)

        buttonSayfaY.setOnClickListener {
            val intent = Intent(this@SayfaIki,SayfaY::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        finish()
        super.onBackPressed()
    }
}