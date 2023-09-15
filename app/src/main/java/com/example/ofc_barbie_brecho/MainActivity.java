package com.example.ofc_barbie_brecho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnentrar(View view) {
        Intent intent = new Intent(this, QuemSomosNos.class);
        startActivity(intent);
    }
}