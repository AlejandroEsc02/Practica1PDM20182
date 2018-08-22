package com.example.agendav3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.agendav3.MainActivityAgendav3.cont;
import static com.example.agendav3.MainActivityAgendav3.correos;
import static com.example.agendav3.MainActivityAgendav3.fechasn;
import static com.example.agendav3.MainActivityAgendav3.lugaresn;
import static com.example.agendav3.MainActivityAgendav3.nombres;
import static com.example.agendav3.MainActivityAgendav3.sexos;

public class MainActivityBuscar extends AppCompatActivity {
    private EditText ebuscar;
    private TextView tcontacto;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_buscar);
        ebuscar=findViewById(R.id.ebuscar);
        tcontacto=findViewById(R.id.tcontacto);


    }
    public void busqueda(View view){
        String buscado;
        int f=0;
        buscado=ebuscar.getText().toString();
        for (int i=0;i<cont;i++){
            if (buscado.equals(nombres[i])){
                tcontacto.setText("\n"+"Nombre: " +nombres[i]+"\n"+ "Correo: "
                        +correos[i]+"\n" + "Lugar Nacimiento: "+ lugaresn[i]+"\n" + "Fecha de Nacimiento: "
                        + fechasn[i]+"\n"+ "Sexo: "+ sexos[i]+"\n"+"\n"+"\n");
                i=cont;
                f=4;
            }
        }
        if (f==0) {
            Toast.makeText(getApplicationContext(), "Contacto no existente.",
                    Toast.LENGTH_SHORT).show();
            tcontacto.setText("");
        }

    }

    public void goinicio (View view){
        Intent intent1 =new Intent(MainActivityBuscar.this,MainActivityAgendav3.class);
        startActivity(intent1);

    }
}
