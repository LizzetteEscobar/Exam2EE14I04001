package com.example.exam2ee14i04001;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adaptadores.Contactos;
import Adaptadores.AdaptadorContactos;

public class ListaContacto extends AppCompatActivity {

    //Declaracion de variables
    private List<Contactos> dataSources;
    private RecyclerView recyclerContactos;
    private LinearLayoutManager lManager;
    private AdaptadorContactos adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contactos);

        //Inicializamos los objetos
        this.recyclerContactos = findViewById(R.id.listContactos);
        this.CargarDatos();
        this.lManager = new LinearLayoutManager(this);
        this.adaptador = new AdaptadorContactos(this.dataSources);

        //Establecemos las propiedades
        this.recyclerContactos.setHasFixedSize(true);
        this.recyclerContactos.setLayoutManager(this.lManager);
        this.recyclerContactos.setAdapter(this.adaptador);
    }

    private void CargarDatos() {
        this.dataSources = new ArrayList<>();
        //Creamos el 1° Contacto
        Contactos nuevoConctato = new Contactos();
        nuevoConctato.setApellido("");
        nuevoConctato.getApellido();
        nuevoConctato.getTelefono1();
        nuevoConctato.getTelefono2();
        this.dataSources.add(nuevoConctato);

    }
}
