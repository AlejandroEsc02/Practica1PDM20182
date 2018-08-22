package com.example.agendav3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;



public class MainActivityAgendav3 extends AppCompatActivity {

    private Button bver, bbuscar, beliminar, bregistrar;

    public static String[] nombres = new String[10];
    public static String[] contras = new String[10];
    public static String[] correos = new String[10];
    public static String[] fechasn = new String[10];
    public static String[] lugaresn = new String[10];
    public static String[] sexos = new String[10];
    public static int cont = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_agendav3);
        bver = findViewById(R.id.bver);
        bbuscar = findViewById(R.id.bbuscar);
        bregistrar = findViewById(R.id.bregistrar);
        beliminar = findViewById(R.id.bbuscar);


    }

    public void gover(View view) {
        Intent intent1 = new Intent(MainActivityAgendav3.this, MainActivityVer.class);
        startActivity(intent1);

    }

    public void goregistrar(View view) {
        Intent intent2 = new Intent(MainActivityAgendav3.this, MainActivityRegistrar.class);
        startActivity(intent2);

    }

    public void gobuscar(View view) {
        Intent intent3 = new Intent(MainActivityAgendav3.this, MainActivityBuscar.class);
        startActivity(intent3);

    }

    public void goeliminar(View view) {
        Intent intent4 = new Intent(MainActivityAgendav3.this, MainActivityEliminar.class);
        startActivity(intent4);

    }
}

