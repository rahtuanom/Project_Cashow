package com.example.cashow1.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.cashow1.R;

public class MainActivity extends AppCompatActivity {

    Button continue1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        continue1 = findViewById(R.id.continue1);
        continue1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(MainActivity.this, login1.class);
                MainActivity.this.startActivity(next);
            }
        });
    }
}