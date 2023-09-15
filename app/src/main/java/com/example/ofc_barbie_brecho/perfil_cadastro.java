package com.example.ofc_barbie_brecho;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class perfil_cadastro extends AppCompatActivity {
    static String message;
    static String msg;
    static String mensagem;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_cadastro);


        Intent intentLogin = getIntent();
        String nome = intentLogin.getStringExtra("nome");
        String email = intentLogin.getStringExtra("email");

        // Exiba os dados na tela
        TextView nomeText = findViewById(R.id.txtnomeperfil1);
        TextView emailText = findViewById(R.id.txtemailperfil2);

        nomeText.setText( ""+ nome);
        emailText.setText("Email: " + email);

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
