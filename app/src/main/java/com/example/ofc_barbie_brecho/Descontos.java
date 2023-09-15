package com.example.ofc_barbie_brecho;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Descontos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_descontos);
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
        Intent intent = new Intent(this, Perfil.class);
        startActivity(intent);
    }

    public void desconto1(View d) {
        Uri uri = Uri.parse("https://www.lojasrenner.com.br/");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void desconto2(View d) {
        Uri uri = Uri.parse("https://www.riachuelo.com.br/?gclid=CjwKCAjw3oqoBhAjEiwA_UaLtrvXjjICSdGBp5Am1tejlXdvQ11-yy4RN3BvIyoSqs7ph2jJdmQKdhoCpaYQAvD_BwE");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }

    public void desconto3(View d) {
        Uri uri = Uri.parse("https://www.cea.com.br/?gclid=CjwKCAjw3oqoBhAjEiwA_UaLtoOqdV27PHbzoZGCR-SpE-Tsqg8_XmRWB29Rae2X0ztCeIZTA_65ehoCP8wQAvD_BwE");
        Intent it = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(it);
    }
}