package com.example.nurasima.laundrypedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nurasima on 16/05/2018.
 */

public class MainHalamanUtama extends AppCompatActivity {
    public class MainHome extends AppCompatActivity {
        @BindView(R.id.lanjut)
        Button lanjut;
    }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.tampilanawal);
            ButterKnife.bind(this);
        }

        @OnClick(R.id.lanjut)
        public void setLanjut(View view) {
            Intent intent = new Intent(MainHalamanUtama.this, MainLogin2.class);
            startActivity(intent);
        }
}

