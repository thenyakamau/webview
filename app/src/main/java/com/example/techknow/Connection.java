package com.example.techknow;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Connection extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_connection);

        Button _refresh = findViewById(R.id._refresh);
        _refresh.setOnClickListener(v->startActivity(new Intent(this, MainActivity.class)));
        this.finish();
    }
}
