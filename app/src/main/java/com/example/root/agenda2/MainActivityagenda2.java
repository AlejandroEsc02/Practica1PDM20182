package com.example.root.agenda2;

import android.app.DatePickerDialog;
import android.app.Dialog;

import android.content.Intent;
import android.preference.EditTextPreference;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.text.Html;


import java.util.Calendar;

public class MainActivityagenda2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button bguardar;
    private EditText enombre, econtra, erepcontra, ecorreo;
    private static TextView efechan;
    private Spinner slugarn;
    private TextView tdatos;
    private String sexo = "masculino";
    private CheckBox chcine, chleer, chdormir, chps4;
    public static String[] lugarn = new String[]{"Bogotá", "Medellín", "Cali", "Barranquilla", "Pasto"};
    public static String lugarns;
    public static String nombre, pass, repass, hobbies = "", correo,fechan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityagenda2);

        enombre = findViewById(R.id.enombre);
        econtra = findViewById(R.id.econtra);
        erepcontra = findViewById(R.id.erepcontra);
        tdatos = findViewById(R.id.tdatos);
        bguardar = findViewById(R.id.bguardar);
        chcine = findViewById(R.id.chcine);
        chdormir = findViewById(R.id.chdormir);
        chleer = findViewById(R.id.chleer);
        chps4 = findViewById(R.id.chps4);
        ecorreo = findViewById(R.id.ecorreo);
        slugarn = findViewById(R.id.slugarn);
        efechan = findViewById(R.id.efechan);



        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lugarn);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        slugarn.setAdapter(aa);
        slugarn.setOnItemSelectedListener(this);


        bguardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                nombre = enombre.getText().toString();
                pass = econtra.getText().toString();
                repass = erepcontra.getText().toString();
                correo = ecorreo.getText().toString();
                fechan = efechan.getText().toString();

                String snombre = "<b>Nombre: </b>";
                String scorreo = "<b>Correo: </b>";
                String ssexo = "<b>Sexo: </b>";
                String shobbies = "<b>Hobbies: </b>";
                String sfechan = "<b>Fecha Nacimiento: </b>";
                String slugarn = "<b>Lugar Nacimiento: </b>";



                if (nombre.equals("") || pass.equals("") || repass.equals("") || correo.equals("")) {
                    Toast.makeText(getApplicationContext(), "Digite todos los campos",
                            Toast.LENGTH_SHORT).show();
                } else {
                    if (pass.equals(repass)) {
                        if (chcine.isChecked()) hobbies = hobbies + "Cine" + ", ";
                        if (chleer.isChecked()) hobbies = hobbies + "Leer" + ", ";
                        if (chdormir.isChecked()) hobbies = hobbies + "Dormir" + ", ";
                        if (chps4.isChecked()) hobbies = hobbies + "Ps4" + ", ";


                        tdatos.setText(Html.fromHtml(snombre) + nombre + "\n" +
                                Html.fromHtml(scorreo)+ correo + "\n" +
                                Html.fromHtml(ssexo)+ sexo +"\n" +
                                Html.fromHtml(shobbies)+ hobbies +"\n" +
                                Html.fromHtml(sfechan)+ fechan + "\n" +
                                Html.fromHtml(slugarn)+ lugarns);
                    } else {
                        Toast.makeText(getApplicationContext(), "Contraseñas no iguales",
                                Toast.LENGTH_SHORT).show();
                    }
                }


            }
        });
    }



    public void radioButtonClicker(View view) {
        int id = view.getId();

        if (id == R.id.rbhombre) {
            sexo = "Masculino";
        } else {
            sexo = "Femenino";
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


        lugarns = adapterView.getItemAtPosition(i).toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {



    }


    public static class DatePickerFragment extends DialogFragment
            implements DatePickerDialog.OnDateSetListener {

        @Override
        public Dialog onCreateDialog(Bundle savedInstanceState) {
            // Use the current date as the default date in the picker
            final Calendar c = Calendar.getInstance();
            int year = c.get(Calendar.YEAR);
            int month = c.get(Calendar.MONTH);
            int day = c.get(Calendar.DAY_OF_MONTH);

            // Create a new instance of DatePickerDialog and return it
            return new DatePickerDialog(getActivity(), this, year, month, day);
        }

        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

            String month = String.valueOf(monthOfYear + 1);
            String day = String.valueOf(dayOfMonth);

            if (dayOfMonth >= 1 && dayOfMonth <= 9) {
                day = "0" + day;
            }
            if (monthOfYear >= 0 && monthOfYear <= 8) {
                month = "0" + month;
            }
            efechan.setText(year + "-" + month + "-" + day);
        }
    }
    public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }


}

