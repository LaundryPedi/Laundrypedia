package com.example.nurasima.laundrypedia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by Nurasima on 18/05/2018.
 */

public class MainKonfirm extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konfirmasi);
        ButterKnife.bind(this);
    }
}
