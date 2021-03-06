package com.example.nurasima.laundrypedia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nurasima on 23/02/2018.
 */

public class MainHome extends AppCompatActivity {
    @BindView(R.id.nextreg)ImageButton nextreg;
    @BindView(R.id.buttonberanda)Button buttonberanda;
    @BindView(R.id.buttonriwayat)Button buttonriwayat;
    @BindView(R.id.buttonprofil)Button buttonprofil;
    @BindView(R.id.buttontentang)Button buttontentang;

    @Override
   protected void onCreate(Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView(R.layout.home);
    ButterKnife.bind(this);
   }
   @OnClick(R.id.nextreg)
   public void setNextreg(View view){
    Intent intent = new Intent(MainHome.this,MainAntarJemput.class);
    startActivity(intent);
    }
    @OnClick(R.id.buttonberanda)
    public void setButtonberanda(View view){
        Intent intent = new Intent(MainHome.this,MainHome.class);
        startActivity(intent);
    }
    @OnClick(R.id.buttonriwayat)
    public void setButtonriwayat(View view){
        Intent intent = new Intent(MainHome.this,MainRiwayat.class);
        startActivity(intent);
    }
    @OnClick(R.id.buttonprofil)
    public void setButtonprofil(View view){
        Intent intent = new Intent(MainHome.this,MainProfil.class);
        startActivity(intent);
    }
    @OnClick(R.id.buttontentang)
    public void setButtontentang(View view){
        Intent intent = new Intent(MainHome.this,MainAbout.class);
        startActivity(intent);
    }
}
