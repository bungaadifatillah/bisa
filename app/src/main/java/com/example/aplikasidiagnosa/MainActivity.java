package com.example.aplikasidiagnosa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView konsul,penyakit,lokasi,tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        konsul = (CardView) findViewById(R.id.konsultasi);
        penyakit   = (CardView) findViewById(R.id.penyakit);
        tentang    = (CardView) findViewById(R.id.tentang);
        lokasi     = (CardView) findViewById(R.id.lokasi);

        konsul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),KonsultasiActivity.class);
                startActivity(i);
            }
        });

        penyakit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),DaftarPenyakitActivity.class);
                startActivity(i);
            }
        });

        tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TentangActivity.class);
                startActivity(i);
            }
        });

        lokasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),LokasiActivity.class);
                startActivity(i);
            }
        });


    }






}