package com.example.ofc_barbie_brecho;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Doar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doar);
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

    public void btnvejamais(View e) {
        Intent intent = new Intent(this, vejamais.class);
        startActivity(intent);
    }

    public void Video(View w) {
        Uri uri = Uri.parse("https://www.youtube.com/watch?v=MYL2iQh7apY&ab_channel=DiicasdaFee");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
    public void btnlocalizacao(View e) {
        Intent intent = new Intent(this, Localizacao.class);
        startActivity(intent);
    }


}