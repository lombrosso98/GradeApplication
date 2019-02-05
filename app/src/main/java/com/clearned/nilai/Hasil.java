package com.clearned.nilai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Hasil extends AppCompatActivity {

    TextView hasil;
    String nama,npm,kelas,uas,uts,grade;
    //int uts,uas;
    double tuas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        nama = getIntent().getStringExtra("nama");
        npm = getIntent().getStringExtra("npm");
        kelas = getIntent().getStringExtra("kelas");
        //uts = getIntent().getIntExtra("uts",0);
        uts = getIntent().getStringExtra("uts");
        uas = getIntent().getStringExtra("uas");

        tuas = (Integer.parseInt(uts)*0.7)+(Integer.parseInt(uas)*0.3);

        if(tuas>=80){
            grade = "Grade Anda A";
        }


        hasil = (TextView) findViewById(R.id.hasil);
        hasil.setText("Nama : "+nama+"\nNPM : "+npm+"\nKelas : "+kelas+"\nNilai : "+String.valueOf(tuas)+"\n"+grade);

    }
}
