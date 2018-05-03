package com.example.nurasima.laundrypedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nurasima on 23/02/2018.
 */

public class MainRegister extends AppCompatActivity {
    @BindView(R.id.signup)Button signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.signup)
    public void setSignup(){
        Intent intent = new Intent(MainRegister.this, MainLogin2.class);
        startActivity(intent);
    }
}
