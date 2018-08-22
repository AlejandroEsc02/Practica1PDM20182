package com.example.resistencia;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity_Resistencia extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner spinner1, spinner2, spinner3;
    private TextView resul;
    private LinearLayout c1,c2,c3;
    String color1, color2, color3,a1="0",a2="0",a3="0";
    String[] numeros = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__resistencia);

        spinner1 = findViewById(R.id.spinner1);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        resul = findViewById(R.id.resul);
        c1=findViewById(R.id.c1);
        c2=findViewById(R.id.c2);
        c3=findViewById(R.id.c3);


        String[] colores = new String[]{"Negro", "Cafe", "Rojo", "Naranja", "Amarillo", "Verde", "Azul",
                "Morado", "Gris", "Blanco"};




        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, colores);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(aa);
        spinner1.setOnItemSelectedListener(this);
        spinner1.setOnItemSelectedListener(new spinner1Class());

        ArrayAdapter bb = new ArrayAdapter(this, android.R.layout.simple_spinner_item, colores);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(bb);
        spinner2.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(new spinner2Class());

        ArrayAdapter cc = new ArrayAdapter(this, android.R.layout.simple_spinner_item, colores);
        cc.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3.setAdapter(cc);
        spinner3.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(new spinner3Class());




    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    private class spinner1Class implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            color1 = adapterView.getItemAtPosition(i).toString();
            a1= numeros[i];
            int v=(Integer.parseInt(a3));
            double x1 = Math.pow(10, v);
            double result;
            result=Double.parseDouble(a1+a2)*x1;
            resul.setText(String.valueOf(result));

            switch (a1){
                case ("0"):
                    c1.setBackgroundColor(Color.parseColor("#000000"));
                    break;
                case ("1"):
                    c1.setBackgroundColor(Color.parseColor("#8b4513"));
                    break;
                case ("2"):
                    c1.setBackgroundColor(Color.parseColor("#ff0000"));
                    break;
                case ("3"):
                    c1.setBackgroundColor(Color.parseColor("#ff8c00"));
                    break;
                case ("4"):
                    c1.setBackgroundColor(Color.parseColor("#ffd700"));
                    break;
                case ("5"):
                    c1.setBackgroundColor(Color.parseColor("#008000"));
                    break;
                case ("6"):
                    c1.setBackgroundColor(Color.parseColor("#00008b"));
                    break;
                case ("7"):
                    c1.setBackgroundColor(Color.parseColor("#800080"));
                    break;
                case ("8"):
                    c1.setBackgroundColor(Color.parseColor("#808080"));
                    break;
                case ("9"):
                    c1.setBackgroundColor(Color.parseColor("#ffffff"));
                    break;


            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    }


    private class spinner2Class implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            color2 = adapterView.getItemAtPosition(i).toString();
            a2= numeros[i];
            int v=(Integer.parseInt(a3));
            double x1 = Math.pow(10, v);
            double result;
            result=Double.parseDouble(a1+a2)*x1;
            resul.setText(String.valueOf(result));

            switch (a2){
                case ("0"):
                    c2.setBackgroundColor(Color.parseColor("#000000"));
                    break;
                case ("1"):
                    c2.setBackgroundColor(Color.parseColor("#8b4513"));
                    break;
                case ("2"):
                    c2.setBackgroundColor(Color.parseColor("#ff0000"));
                    break;
                case ("3"):
                    c2.setBackgroundColor(Color.parseColor("#ff8c00"));
                    break;
                case ("4"):
                    c2.setBackgroundColor(Color.parseColor("#ffd700"));
                    break;
                case ("5"):
                    c2.setBackgroundColor(Color.parseColor("#008000"));
                    break;
                case ("6"):
                    c2.setBackgroundColor(Color.parseColor("#00008b"));
                    break;
                case ("7"):
                    c2.setBackgroundColor(Color.parseColor("#800080"));
                    break;
                case ("8"):
                    c2.setBackgroundColor(Color.parseColor("#808080"));
                    break;
                case ("9"):
                    c2.setBackgroundColor(Color.parseColor("#ffffff"));
                    break;


            }

        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }


    private class spinner3Class implements AdapterView.OnItemSelectedListener {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            color3 = adapterView.getItemAtPosition(i).toString();
            a3= numeros[i];
            int v=(Integer.parseInt(a3));
            double x1 = Math.pow(10, v);
            double result;
            result=Double.parseDouble(a1+a2)*x1;
            resul.setText(String.valueOf(result));

            switch (a3){
                case ("0"):
                    c3.setBackgroundColor(Color.parseColor("#000000"));
                    break;
                case ("1"):
                    c3.setBackgroundColor(Color.parseColor("#8b4513"));
                    break;
                case ("2"):
                    c3.setBackgroundColor(Color.parseColor("#ff0000"));
                    break;
                case ("3"):
                    c3.setBackgroundColor(Color.parseColor("#ff8c00"));
                    break;
                case ("4"):
                    c3.setBackgroundColor(Color.parseColor("#ffd700"));
                    break;
                case ("5"):
                    c3.setBackgroundColor(Color.parseColor("#008000"));
                    break;
                case ("6"):
                    c3.setBackgroundColor(Color.parseColor("#00008b"));
                    break;
                case ("7"):
                    c3.setBackgroundColor(Color.parseColor("#800080"));
                    break;
                case ("8"):
                    c3.setBackgroundColor(Color.parseColor("#808080"));
                    break;
                case ("9"):
                    c3.setBackgroundColor(Color.parseColor("#ffffff"));
                    break;


            }



        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    }
}




