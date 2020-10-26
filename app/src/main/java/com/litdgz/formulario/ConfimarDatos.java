package com.litdgz.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ConfimarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;
    private Button   btnEditarDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confimar_datos);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString(getResources().getString(R.string.pNombre));
        String fecha = parametros.getString(getResources().getString(R.string.pFecha));
        String email = parametros.getString(getResources().getString(R.string.pEmail));
        String telefono = parametros.getString(getResources().getString(R.string.pTelefono));
        String descripcion = parametros.getString(getResources().getString(R.string.pDescripcion));

        tvNombre   = (TextView) findViewById(R.id.tv_nombre);
        tvFecha    = (TextView) findViewById(R.id.tv_fechaNacimiento);
        tvTelefono = (TextView) findViewById(R.id.tv_telefono);
        tvEmail    = (TextView) findViewById(R.id.tv_email);
        tvDescripcion = (TextView) findViewById(R.id.tv_descripcion);
        btnEditarDatos = (Button) findViewById(R.id.btn_editarDatos);

        tvNombre.setText(nombre);
        tvFecha.setText(fecha);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);

        btnEditarDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ConfimarDatos.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }





}