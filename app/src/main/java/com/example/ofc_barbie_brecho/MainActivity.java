package com.example.ofc_barbie_brecho;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread timer = new Thread(() -> {
            try {
                Thread.sleep(1500);
                Intent intent = new Intent(getBaseContext(), QuemSomosNos.class);
                startActivity(intent);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });
        timer.start();
    }
}