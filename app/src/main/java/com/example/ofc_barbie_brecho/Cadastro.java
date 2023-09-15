package com.example.ofc_barbie_brecho;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Cadastro extends AppCompatActivity {
    EditText nomeEdit;
    EditText emailEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomeEdit = findViewById(R.id.txtnomecadastro);
        emailEdit = findViewById(R.id.ic_email);

        Button loginButton = findViewById(R.id.btncadastrarcadastro);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtenha o nome e o email inseridos pelo usuário
                String nome = nomeEdit.getText().toString();
                String email = emailEdit.getText().toString();

                // Crie um Intent
                Intent intent = new Intent(Cadastro.this, perfil_cadastro.class);

                // Adicione o nome e o email como extras no Intent
                intent.putExtra("nome", nome);
                intent.putExtra("email", email);

                // Inicie a ActivityPerfil
                startActivity(intent);
            }
        });
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
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    public void btncadastrar(View p) {
        Intent intent = new Intent(this, perfil_cadastro.class);
        startActivity(intent);
    }
}