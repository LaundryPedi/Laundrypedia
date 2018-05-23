package com.example.nurasima.laundrypedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nurasima on 18/05/2018.
 */

public class MainKonfirm extends AppCompatActivity {
    @BindView(R.id.buttonberanda)Button buttonberanda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konfirmasi);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonberanda)
    public void setKonfirm (View view){
        Intent intent = new Intent(MainKonfirm.this,MainHome.class);
        startActivity(intent);
    }
}
