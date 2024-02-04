package com.example.latihanmembuatlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import com.google.android.material.snackbar.Snackbar;


public class Komponen extends AppCompatActivity {
    private EditText editText;
    private RadioButton radio_pria, radio_wanita;
    private CheckBox checkbox_coding, checkbox_reading, checkbox_traveling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_komponen);
        editText = findViewById(R.id.editText);
        radio_pria = findViewById(R.id.radio_pria);
        radio_wanita = findViewById(R.id.radio_wanita);
        checkbox_coding = findViewById(R.id.checkbox_coding);
        checkbox_reading = findViewById(R.id.checkbox_reading);
        checkbox_traveling = findViewById(R.id.checkbox_traveling);

        ImageButton imageButtonPlus = findViewById(R.id.imageButtonPlus);
        ImageButton imageButtonCross = findViewById(R.id.imageButtonCross);

        imageButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSnackbar();
            }
        });

        imageButtonCross.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearFields();
            }
        });
    }

    private void showSnackbar() {
        String nama = editText.getText().toString();
        String gender = getSelectedGender();
        String hobi = getSelectedHobi();

        String message = "Nama: " + nama + ", Gender: " + gender + ", Hobi: " + hobi;

        Snackbar.make(findViewById(android.R.id.content), message, Snackbar.LENGTH_LONG).show();
    }

    private String getSelectedGender() {
        if (radio_pria.isChecked()) {
            return "Pria";
        } else if (radio_wanita.isChecked()) {
            return "Wanita";
        } else {
            return "";
        }
    }

    private String getSelectedHobi() {
        StringBuilder hobi = new StringBuilder();
        if (checkbox_coding.isChecked()) {
            hobi.append("Coding");
        }
        if (checkbox_reading.isChecked()) {
            if (hobi.length() > 0) {
                hobi.append(", ");
            }
            hobi.append("Reading");
        }
        if (checkbox_traveling.isChecked()) {
            if (hobi.length() > 0) {
                hobi.append(", ");
            }
            hobi.append("Traveling");
        }
        return hobi.toString();
    }

    private void clearFields() {
        editText.setText("");
        radio_pria.setChecked(false);
        radio_wanita.setChecked(false);
        checkbox_coding.setChecked(false);
        checkbox_reading.setChecked(false);
        checkbox_traveling.setChecked(false);
    }
}