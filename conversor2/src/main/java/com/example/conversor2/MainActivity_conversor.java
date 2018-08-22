package com.example.conversor2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_conversor extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private EditText eentra;
    private TextView tresul;
    private Spinner spindes, spina;
    public String libes ="Libra Esterlina - Inglaterra";
    static String colp ="Pesos Colombianos - Colombia";
    static String us ="Dolares US - Estados Unidos";
    static String eu="Euros - Europa";

    String[] desdec = new String[]{libes, colp,us,eu};
    String[] ac = new String[]{libes, colp,us,eu};
    String desdesel="Libra Esterlina - Inglaterra", asel="Libra Esterlina - Inglaterra";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_conversor);


        eentra = findViewById(R.id.eentra);
        tresul = findViewById(R.id.tresul);
        spindes = findViewById(R.id.spindes);
        spina = findViewById(R.id.spina);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, desdec);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spindes.setAdapter(aa);
        spindes.setOnItemSelectedListener(this);
        spindes.setOnItemSelectedListener(new DesdeSpinnerClass());

        ArrayAdapter bb = new ArrayAdapter(this, android.R.layout.simple_spinner_item, ac);
        bb.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spina.setAdapter(bb);
        spina.setOnItemSelectedListener(this);
        spina.setOnItemSelectedListener(new ASpinnerClass());


        }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void calcule(View view){
        String valor="0";
        float valorf=0;
        if(eentra.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(), "Ingrese un valor.",
                    Toast.LENGTH_SHORT).show();
        }else {
            valor =eentra.getText().toString();
            valorf = Float.parseFloat(valor);
        }


        switch(desdesel){
            case ("Libra Esterlina - Inglaterra"):
                switch(asel) {
                    case "Libra Esterlina - Inglaterra":
                        tresul.setText(String.valueOf(valorf)+" Libras Esterlinas");
                        break;
                    case "Pesos Colombianos - Colombia":
                        tresul.setText(String.valueOf(valorf*3833.10)+" Pesos");
                        break;
                    case "Dolares US - Estados Unidos":
                        tresul.setText(String.valueOf(valorf*1.28)+ " Dolares");
                        break;
                    case "Euros - Europa":
                        tresul.setText(String.valueOf(valorf*1.11)+ " Euros");
                        break;
                    default:
                        break;

                }
                break;
            case "Pesos Colombianos - Colombia":
                switch(asel) {
                    case "Libra Esterlina - Inglaterra" :
                        tresul.setText(String.valueOf(valorf/3833.10)+" Libras Esterlinas");
                        break;
                    case "Pesos Colombianos - Colombia":
                        tresul.setText(String.valueOf(valorf)+" Pesos");
                        break;
                    case "Dolares US - Estados Unidos":
                        tresul.setText(String.valueOf(valorf/3004.94)+ " Dolares");
                        break;
                    case "Euros - Europa":
                        tresul.setText(String.valueOf(valorf/3463.81)+ " Euros");
                        break;
                    default:
                        break;

                }
                break;
            case "Dolares US - Estados Unidos":
                switch(asel) {
                    case "Libra Esterlina - Inglaterra":
                        tresul.setText(String.valueOf(valorf/1.28)+" Libras Esterlinas");
                        break;
                    case "Pesos Colombianos - Colombia":
                        tresul.setText(String.valueOf(valorf*3004.94)+" Pesos");
                        break;
                    case "Dolares US - Estados Unidos":
                        tresul.setText(String.valueOf(valorf)+ " Dolares");
                        break;
                    case "Euros - Europa":
                        tresul.setText(String.valueOf(valorf/1.14)+ " Euros");
                        break;
                    default:
                        break;

                }
                break;
            case "Euros - Europa":
                switch(asel) {
                    case "Libra Esterlina - Inglaterra":
                        tresul.setText(String.valueOf(valorf/1.11)+" Libras Esterlinas");
                        break;
                    case "Pesos Colombianos - Colombia":
                        tresul.setText(String.valueOf(valorf*3463.81)+" Pesos");
                        break;
                    case "Dolares US - Estados Unidos":
                        tresul.setText(String.valueOf(valorf*1.14)+ " Dolares");
                        break;
                    case "Euros - Europa":
                        tresul.setText(String.valueOf(valorf)+ " Euros");
                        break;
                    default:
                        break;


                }
                break;
        }

    }


    class DesdeSpinnerClass implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            desdesel = adapterView.getItemAtPosition(i).toString();
        }
        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }


        }


    class ASpinnerClass implements AdapterView.OnItemSelectedListener {

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            asel = adapterView.getItemAtPosition(i).toString();

            }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {


        }

    }
}
