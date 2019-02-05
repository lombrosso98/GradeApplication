package com.clearned.nilai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
String nama2, kelas2, npm2;
String uts2, uas2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = (EditText) findViewById(R.id.nama);
        npm = (EditText) findViewById(R.id.npm);
        kelas = (EditText) findViewById(R.id.kelas);
        uts = (EditText) findViewById(R.id.uts);
        uas = (EditText) findViewById(R.id.uas);
    }
    EditText nama, npm, kelas, uts, uas;

    public void proses(View view) {
        if(nama.getText().toString().length()<=0){
            nama.setError("Enter Nama");
        }
        else if(npm.getText().toString().length()<=0){
            npm.setError("Enter Nama");
        }
        else if(kelas.getText().toString().length()<=0){
            kelas.setError("Enter Nama");
        }
        else if(uts.getText().toString().length()<=0){
            uts.setError("Enter Nama");
        }
        else if (uas.getText().toString().length()<=0){
            uas.setError("Enter Nama");
        }
        else{
            //buat tipe data
            nama2 = nama.getText().toString();
            npm2 = npm.getText().toString();
            kelas2 = kelas.getText().toString();
            uts2 = uts.getText().toString();
            uas2 = uas.getText().toString();
            Intent intent = new Intent(this,Hasil.class);
            intent.putExtra("nama", nama2);
            intent.putExtra("npm", npm2);
            intent.putExtra("kelas", kelas2);
            intent.putExtra("uts", uts2);
            intent.putExtra("uas", uas2);
            startActivity(intent);
        }
    }
}
