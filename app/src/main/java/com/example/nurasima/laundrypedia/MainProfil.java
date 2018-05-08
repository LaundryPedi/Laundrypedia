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
 * Created by Nurasima on 08/05/2018.
 */

public class MainProfil extends AppCompatActivity {
    @BindView(R.id.keluar)Button keluar;
    @BindView(R.id.simpan)Button simpan;
    @BindView(R.id.buttonberanda)Button buttonberanda;
    @BindView(R.id.buttonriwayat)Button buttonriwayat;
    @BindView(R.id.buttonprofil)Button buttonprofil;
    @BindView(R.id.buttontentang)Button buttontentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView(R.layout.profil);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.keluar)
    public void setKeluar(View view){
        Intent intent = new Intent(MainProfil.this,MainLogin2.class);
        startActivity(intent);
    }
    @OnClick(R.id.simpan)
    public void setSimpan (View view){
        Intent intent = new Intent(MainProfil.this,MainProfil.class);
        startActivity(intent);
    }
    @OnClick(R.id.buttonberanda)
    public void setButtonberanda(View view){
        Intent intent = new Intent(MainProfil.this,MainHome.class);
        startActivity(intent);
    }
    @OnClick(R.id.buttonriwayat)
    public void setButtonriwayat(View view){
        Intent intent = new Intent(MainProfil.this,MainRiwayat.class);
        startActivity(intent);
    }
    @OnClick(R.id.buttonprofil)
    public void setButtonprofil(View view){
        Intent intent = new Intent(MainProfil.this,MainProfil.class);
        startActivity(intent);
    }
    @OnClick(R.id.buttontentang)
    public void setButtontentang(View view){
        Intent intent = new Intent(MainProfil.this,MainAbout.class);
        startActivity(intent);
    }
}
