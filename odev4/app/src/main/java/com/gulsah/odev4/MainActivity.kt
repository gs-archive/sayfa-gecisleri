package com.gulsah.odev4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonSayfaBir.setOnClickListener {
            val intent = Intent(this@MainActivity,SayfaBir::class.java)
            startActivity(intent)
        }
        buttonSayfaX.setOnClickListener {
            val intent = Intent(this@MainActivity,SayfaX::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        val cikisIntent = Intent(Intent.ACTION_MAIN)
        cikisIntent.addCategory(Intent.CATEGORY_HOME)
        cikisIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        startActivity(cikisIntent)
    }
}