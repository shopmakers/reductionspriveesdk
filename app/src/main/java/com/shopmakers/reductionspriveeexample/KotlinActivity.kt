package com.shopmakers.reductionspriveeexample

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.shopmakers.advertisementviews.overlay.view.AdvertisementOverlay

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        findViewById<AppCompatButton>(R.id.btnOverlay).setOnClickListener {
            AdvertisementOverlay.newInstance(this, 5, 5)
        }
        findViewById<AppCompatButton>(R.id.btnJava).setOnClickListener {
            openJavaExample()
        }
    }

    private fun openJavaExample() {
        startActivity(Intent(this, JavaActivity::class.java))
    }
}