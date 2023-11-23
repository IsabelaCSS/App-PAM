package com.example.ofc_barbie_brecho;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class Localizacao extends AppCompatActivity {
    // Variaveis
    private static final int REQUEST_LOCATION = 1;
    TextView location;
    LocationManager lm;
    String lat,lon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizacao);

        //local que aparece-rá a latitude e longitude

        ActivityCompat.requestPermissions(this, new String[]{
                Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);

        location = findViewById(R.id.txtLocation);
    }
    public void pegarLocalizacao(View v){
        lm = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if(!lm.isProviderEnabled(LocationManager.GPS_PROVIDER)) {
            OnGPS();
        }else{
            getLocation();
            Uri actualLocation = Uri.parse("geo:" + lat + ", " + lon + "?q=brechos");
            Intent maps = new Intent(Intent.ACTION_VIEW, actualLocation);
            startActivity(maps);
        }
    }

    //permições da localização
    @SuppressLint("SetTextI18n")
    private void getLocation() {
        if(ActivityCompat.checkSelfPermission(Localizacao.this, Manifest.permission.ACCESS_FINE_LOCATION)
                != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission
                (Localizacao.this, Manifest.permission.ACCESS_COARSE_LOCATION)
                != PackageManager.PERMISSION_GRANTED){

            ActivityCompat.requestPermissions(this, new String[]{
                    Manifest.permission.ACCESS_FINE_LOCATION}, REQUEST_LOCATION);
        }else{
            Location locationGPS = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);
            Location locationNetwork = lm.getLastKnownLocation(LocationManager.NETWORK_PROVIDER);
            Location locationPassive = lm.getLastKnownLocation(LocationManager.PASSIVE_PROVIDER);

            //colocando as variaveis nas strings

            if(locationGPS != null){
                double latitude = locationGPS.getLatitude();
                double longitude = locationGPS.getLongitude();

                lat = String.valueOf(latitude);
                lon = String.valueOf(longitude);

                location.setText("Localização atual:" + "\n" + "Latitude: " + lat + "\n" + "Longitude: " + lon);
            }else if(locationNetwork != null){
                double latitude = locationNetwork.getLatitude();
                double longitude = locationNetwork.getLongitude();

                lat = String.valueOf(latitude);
                lon = String.valueOf(longitude);

                location.setText("Localização atual:" + "\n" + "Latitude: " + lat + "\n" + "Longitude: " + lon);
            }else if(locationPassive != null){
                double latitude = locationPassive.getLatitude();
                double longitude = locationPassive.getLongitude();

                lat = String.valueOf(latitude);
                lon = String.valueOf(longitude);

                //colocando um texto ante de mostrar as coordenadas
                location.setText("Localização atual:" + "\n" + "Latitude: " + lat + "\n" + "Longitude: " + lon);
            }else{
                Toast.makeText(this, "Não foi possível pegar a sua localização", Toast.LENGTH_SHORT).show();
            }
        }
    }

    //Um alert (que seria uma permissão do dispositivo) para ativar o GPS
    private void OnGPS() {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Ative o GPS").setCancelable(false).setPositiveButton("YES", (dialogInterface, i) -> startActivity(new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS))).setNegativeButton("NO", (dialogInterface, i) -> dialogInterface.cancel());
        final AlertDialog ad = builder.create();
        ad.show();
    }
}