package com.shopmakers.reductionspriveeexample

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.shopmakers.advertisementviews.banner.view.AdvertisementBanner
import com.shopmakers.advertisementviews.base.listener.AdvertisementListener
import com.shopmakers.advertisementviews.overlay.view.AdvertisementOverlay

class KotlinActivity : AppCompatActivity(), AdvertisementListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        findViewById<AppCompatButton>(R.id.btnOverlay).setOnClickListener {
            AdvertisementOverlay.newInstance(this, 568, 5, this)
        }
        findViewById<AppCompatButton>(R.id.btnJava).setOnClickListener {
            openJavaExample()
        }
        findViewById<AdvertisementBanner>(R.id.advertisementBanner).setAdvertisementListener(this)
    }

    private fun openJavaExample() {
        startActivity(Intent(this, JavaActivity::class.java))
    }

    override fun adLoadingCompleted(tagID: Int) {
        Log.d("asd", "asdasd")
    }

    override fun adLoadingFailedWithError(tagID: Int, error: Error?) {
        Log.d("asd", "asdasd")
    }

    override fun adURLClicked(tagID: Int, uri: Uri?) {
        Log.d("asd", "asdasd")
    }

    override fun adWasClosed(tagID: Int) {
        Log.d("asd", "asdasd")
    }
}