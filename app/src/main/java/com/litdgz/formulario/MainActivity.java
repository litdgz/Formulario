package com.litdgz.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private DatePicker fecha;
    private EditText telefono;
    private EditText email;
    private EditText descripcion;
    private Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre      = (EditText) findViewById(R.id.etv_nombre);
        fecha       = (DatePicker) findViewById(R.id.dp_fechaCumple);
        telefono    = (EditText) findViewById(R.id.etv_telefono);
        email       = (EditText) findViewById(R.id.etv_email);
        descripcion = (EditText) findViewById(R.id.etv_descripcion);
        siguiente   = findViewById(R.id.btn_siguiente);

        int year  = fecha.getYear();
        int month = fecha.getMonth();
        int day   = fecha.getDayOfMonth();

        final String fechaDialogo = month + "/" + day + "/" + year;

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConfimarDatos.class);
                intent.putExtra(getResources().getString(R.string.pNombre), nombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.pFecha), fechaDialogo);
                intent.putExtra(getResources().getString(R.string.pTelefono), telefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.pEmail), email.getText().toString());
                intent.putExtra(getResources().getString(R.string.pDescripcion), descripcion.getText().toString());
                startActivity(intent);
            }
        });
    }


}