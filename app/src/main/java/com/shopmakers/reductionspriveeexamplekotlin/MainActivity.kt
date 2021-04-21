package com.shopmakers.reductionspriveeexamplekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.shopmakers.advertisementviews.overlay.view.AdvertisementOverlay

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<AppCompatButton>(R.id.btnOverlay).setOnClickListener {
            AdvertisementOverlay.newInstance(this, "5", 5)
        }
    }
}