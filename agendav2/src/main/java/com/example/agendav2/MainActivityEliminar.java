package com.example.agendav2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.agendav2.MainActivityAgendav2.cont;
import static com.example.agendav2.MainActivityAgendav2.contras;
import static com.example.agendav2.MainActivityAgendav2.correos;
import static com.example.agendav2.MainActivityAgendav2.fechasn;
import static com.example.agendav2.MainActivityAgendav2.lugaresn;
import static com.example.agendav2.MainActivityAgendav2.nombres;
import static com.example.agendav2.MainActivityAgendav2.sexos;

public class MainActivityEliminar extends AppCompatActivity {
    private EditText eeliminar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_eliminar);
        eeliminar=findViewById(R.id.eeliminar);
    }
    public void elimina(View view){
        String buscado;
        int f=0;
        buscado=eeliminar.getText().toString();
        for (int i=0;i<cont;i++) {
            if (buscado.equals(nombres[i])) {
                f = 1;
                for (int e = i; i < cont; e++) {
                    nombres[e] = nombres[e + 1];
                    contras[e] = contras[e + 1];
                    correos[e] = correos[e + 1];
                    fechasn[e] = fechasn[e + 1];
                    lugaresn[e] = lugaresn[e + 1];
                    sexos[e] = sexos[e + 1];

                    if (e == cont - 1) {
                        Toast.makeText(getApplicationContext(), "Eliminado.",
                                Toast.LENGTH_SHORT).show();
                        f=4;
                        break;
                    }
                }
                cont--;
            }

        }
        if (f==0) {
            Toast.makeText(getApplicationContext(), "Contacto no existente.",
                    Toast.LENGTH_SHORT).show();

        }
    }




    public void goinicio (View view){
        Intent intent1 =new Intent(MainActivityEliminar.this,MainActivityAgendav2.class);
        startActivity(intent1);

    }
}
