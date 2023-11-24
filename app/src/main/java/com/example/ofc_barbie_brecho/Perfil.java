package com.example.ofc_barbie_brecho;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Login.NOME_USUARIO);

        TextView nomeText = findViewById(R.id.txtnomeperfil);
        nomeText.setText(message);
    }

    public void btndeslogar(View se) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void btnsobrenos(View s) {
        Intent intent = new Intent(this, QuemSomosNos.class);
        startActivity(intent);
    }
    public void btndoar(View d) {
        Intent intent = new Intent(this, Doar.class);
        startActivity(intent);
    }
    public void btnperfil(View p) {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void btnseta1(View se) {
        Intent intent = new Intent(this, Descontos.class);
        startActivity(intent);
    }

}