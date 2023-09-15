package com.example.ofc_barbie_brecho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class vejamais extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vejamais);
    }
    public void btnvoltar1(View s) {
        Intent intent = new Intent(this, Doar.class);
        startActivity(intent);
    }
}