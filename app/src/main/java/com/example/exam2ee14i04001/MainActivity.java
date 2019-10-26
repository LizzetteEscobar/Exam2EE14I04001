package com.example.exam2ee14i04001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Button btnAgregarCont, btnListaCont;
    private int estado = 0;
    Handler controlador = new Handler();
    boolean condicion = false;
    public static List<String> listaDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = new ArrayList<String>();
        //Inicializamos los objetos
        this.btnAgregarCont = findViewById(R.id.btnAgragarCont);
        this.btnListaCont = findViewById(R.id.btnListaCont);

        btnAgregarCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirNuevoEncuestado();
            }
        });

        btnListaCont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                abrirListaEncuestado();
            }
        });
    }

    public void abrirNuevoEncuestado(){
        Intent intent = new Intent(this, AgregarContacto.class);
        startActivity(intent);
    }

    public void abrirListaEncuestado(){
        Intent intent = new Intent(this, ListaContacto.class);
        startActivity(intent);
    }
}
