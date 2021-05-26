package com.shopmakers.reductionspriveeexample;

import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.shopmakers.advertisementviews.banner.view.AdvertisementBanner;
import com.shopmakers.advertisementviews.base.listener.AdvertisementListener;
import com.shopmakers.advertisementviews.overlay.view.AdvertisementOverlay;

public class JavaActivity extends AppCompatActivity implements AdvertisementListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        findViewById(R.id.btnOverlay).setOnClickListener(view ->
                AdvertisementOverlay.Companion.newInstance(this, 5, 5, this));
        findViewById(R.id.btnKotlin).setOnClickListener(view -> finish());
        AdvertisementBanner banner = findViewById(R.id.advertisementBanner);
        banner.setAdvertisementListener(this);
    }

    @Override
    public void adLoadingCompleted(int i) {

    }

    @Override
    public void adLoadingFailedWithError(int i, @org.jetbrains.annotations.Nullable Error error) {

    }

    @Override
    public void adURLClicked(int i, @org.jetbrains.annotations.Nullable Uri uri) {

    }

    @Override
    public void adWasClosed(int i) {

    }
}
