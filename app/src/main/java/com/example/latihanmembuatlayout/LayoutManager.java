package com.example.latihanmembuatlayout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;

public class LayoutManager extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_manager);

        toolbar = findViewById(R.id.toolbarInclude);
        setSupportActionBar(toolbar);
    }
}