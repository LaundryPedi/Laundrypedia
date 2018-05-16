package com.example.nurasima.laundrypedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nurasima on 23/02/2018.
 */

public class MainLogin2 extends AppCompatActivity {
    @BindView(R.id.masuk)Button masuk;
    @BindView(R.id.signup)TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutlogin);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.masuk)
    public void masuk (View view){
        Intent intent = new Intent(MainLogin2.this,MainHome.class);
        startActivity(intent);
    }

    @OnClick(R.id.signup)
    public void buat(View view){
        Intent intent = new Intent(MainLogin2.this,MainRegister.class);
        startActivity(intent);
    }
}