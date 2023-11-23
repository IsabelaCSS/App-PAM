package com.example.ofc_barbie_brecho;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {


    public final static String NOME_USUARIO = "com.example.ofc_barbie_brecho.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void enviarName(View name){
        Intent intent = new Intent(this,Perfil.class);
        EditText nome = findViewById(R.id.txtnomelogin);
        String message = nome.getText().toString();
        intent.putExtra(NOME_USUARIO,message);

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
    public void txtEntrarLogin(View p) {
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }
    public void btncadastrar(View p) {
        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }
}