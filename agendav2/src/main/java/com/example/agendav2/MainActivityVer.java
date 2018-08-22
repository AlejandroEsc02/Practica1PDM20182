package com.example.agendav2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.agendav2.MainActivityAgendav2.cont;
import static com.example.agendav2.MainActivityAgendav2.correos;
import static com.example.agendav2.MainActivityAgendav2.fechasn;
import static com.example.agendav2.MainActivityAgendav2.lugaresn;
import static com.example.agendav2.MainActivityAgendav2.nombres;
import static com.example.agendav2.MainActivityAgendav2.sexos;


public class MainActivityVer extends AppCompatActivity {
    private TextView tcontactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_ver);
        tcontactos=findViewById(R.id.tcontactos);
        String re="";


        for (int i=0;i<cont;i++){

            re="\n"+re+ "Contacto # " + String.valueOf(i+1)+"\n"+"Nombre: " +nombres[i]+"\n"+ "Correo: "
                    +correos[i]+"\n" + "Lugar Nacimiento: "+ lugaresn[i]+"\n" + "Fecha de Nacimiento: "
                    + fechasn[i]+"\n"+ "Sexo: "+ sexos[i]+"\n"+"\n"+"\n";
        }


        tcontactos.setText(re);




    }
    public void goinicio (View view){
        Intent intent1 =new Intent(MainActivityVer.this,MainActivityAgendav2.class);
        startActivity(intent1);

    }
}
