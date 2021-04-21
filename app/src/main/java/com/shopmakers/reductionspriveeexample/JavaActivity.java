package com.shopmakers.reductionspriveeexample;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.shopmakers.advertisementviews.overlay.view.AdvertisementOverlay;

public class JavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        findViewById(R.id.btnOverlay).setOnClickListener(view ->
                AdvertisementOverlay.Companion.newInstance(this, "5", 5));
        findViewById(R.id.btnKotlin).setOnClickListener(view -> finish());
    }
}
