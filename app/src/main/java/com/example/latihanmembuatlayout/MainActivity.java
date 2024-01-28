package com.example.latihanmembuatlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView namanya;
    TextView nimnya;
    TextView jurusannya;
    TextView hobinya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        namanya = (TextView) findViewById(R.id.namanya);
        namanya.setText("Ayumi");
        nimnya = (TextView) findViewById(R.id.nimnya);
        nimnya.setText("03081220019");
        jurusannya = (TextView) findViewById(R.id.jurusannya);
        jurusannya.setText("Sistem Informasi");
        hobinya = (TextView) findViewById(R.id.hobinya);
        hobinya.setText("Bermain game");
    }
}