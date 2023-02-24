package com.example.myfpex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton btnActualizar, btnBuscar;
    TextView recomendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnActualizar = findViewById(R.id.imageButtonActualizar);
        btnBuscar = findViewById(R.id.imageButtonBuscar);
        recomendar = findViewById(R.id.txtRecomendacion);

        ArrayList<String> listaCiclos = new ArrayList<>();

        btnActualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recomiendaCiclo(listaCiclos);
            }
        });

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intento = new Intent(v.getContext(), ActividadBusqueda.class);
                startActivity(intento);
            }
        });
    }

    private void recomiendaCiclo(ArrayList<String> listaCiclos) {
        listaCiclos.add("Cuidados Auxiliares de Enfermería");
        listaCiclos.add("Laboratorio Clínico y Biomédico");
        listaCiclos.add("Marketing y Publicidad");
        listaCiclos.add("Automatización y Robótica Industrial");
        listaCiclos.add("Desarrollo de Aplicaciones Multiplataforma");
        listaCiclos.add("Desarrollo de Aplicaciones Web");
        listaCiclos.add("Grado Superior en Administración y Finanzas");
        listaCiclos.add("Grado Superior en Educación Infantil");
        listaCiclos.add("Grado Superior en Administración de Sistemas Informáticos en Red");
        listaCiclos.add("Grado Superior en Integración Social");

        Random r = new Random();

        for (int i = 0; i < listaCiclos.size(); i++) {
            int index = r.nextInt(listaCiclos.size());
            recomendar.setText(listaCiclos.get(index));
        }
    }
}