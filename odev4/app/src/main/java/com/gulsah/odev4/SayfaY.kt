package com.gulsah.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sayfa_y.*

class SayfaY : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sayfa_y)


    }

    override fun onBackPressed() {
        val intent = Intent(this@SayfaY,MainActivity::class.java)
        finish()
        startActivity(intent)
    }
}
