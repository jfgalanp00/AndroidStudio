package com.example.myfpex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

public class ActividadBusqueda extends AppCompatActivity {
    ImageButton btnInicio, btnBuscarCiclo, btnReporte;
    Spinner spProvincia, spFamilia, spCiclo, spTurno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_busqueda);

        btnInicio = findViewById(R.id.btnInicio);
        btnBuscarCiclo = findViewById(R.id.btnBuscar);
        btnReporte = findViewById(R.id.btnReporte);

        spProvincia = findViewById(R.id.spProvincia);
        spFamilia = findViewById(R.id.spFamiliaProfesional);
        spCiclo = findViewById(R.id.spCiclo);
        spTurno = findViewById(R.id.spTurno);

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(v.getContext(), MainActivity.class);
                startActivity(intento);
            }
        });

        btnBuscarCiclo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActividadBusqueda.this, "En Construccion", Toast.LENGTH_SHORT).show();
            }
        });

        btnReporte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(v.getContext(), ActividadReporte.class);
                startActivity(intento);
            }
        });
    }
}