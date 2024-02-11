package com.example.latihanmembuatlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class komponenProduktiv extends AppCompatActivity {

    EditText editText;
    RadioButton radio_luar, radio_dalam;
    CheckBox checkbox_olah, checkbox_jalan, checkbox_makan, checkbox_belajar;
    Button buttonSimpan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen_produktiv);

        editText = findViewById(R.id.editText);
        radio_luar = findViewById(R.id.radio_luar);
        radio_dalam = findViewById(R.id.radio_dalam);
        checkbox_olah = findViewById(R.id.checkbox_olah);
        checkbox_jalan = findViewById(R.id.checkbox_jalan);
        checkbox_makan = findViewById(R.id.checkbox_makan);
        checkbox_belajar = findViewById(R.id.checkbox_belajar);

        buttonSimpan = findViewById(R.id.buttonSimpan);

        buttonSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });
    }

    private void showToast() {
        String namaKegiatan = editText.getText().toString();

        String tempatKegiatan;
        if (radio_luar.isChecked()) {
            tempatKegiatan = "Luar Ruangan";
        } else {
            tempatKegiatan = "Dalam Ruangan";
        }

        StringBuilder jenisKegiatan = new StringBuilder();
        if (checkbox_olah.isChecked()) {
            jenisKegiatan.append("- Olahraga\n");
        }
        if (checkbox_jalan.isChecked()) {
            jenisKegiatan.append("- Jalan-jalan\n");
        }
        if (checkbox_makan.isChecked()) {
            jenisKegiatan.append("- Makan\n");
        }
        if (checkbox_belajar.isChecked()) {
            jenisKegiatan.append("- Belajar\n");
        }

        String message = "Berhasil Disimpan\n" +
                "Nama Kegiatan: " + namaKegiatan + "\n" +
                "Tempat Kegiatan: " + tempatKegiatan + "\n" +
                "Jenis Kegiatan: \n" + jenisKegiatan.toString();

        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }
}