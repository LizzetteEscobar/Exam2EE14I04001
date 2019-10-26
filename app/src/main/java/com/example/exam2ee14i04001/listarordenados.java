package com.example.exam2ee14i04001;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adaptadores.adaptador;
import entidades.objeto;

import static com.example.exam2ee14i04001.MainActivity.listacontacontactos;

public class listarordenados extends AppCompatActivity {

    RecyclerView recycler;
    List<objeto> datasource = new ArrayList<>();
    LinearLayoutManager manager;
    adaptador adaptadorobjeto;
    EditText eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarordenados);


        eliminar = findViewById(R.id.txteliminar);

        recycler = findViewById(R.id.recycler);

        datasource = listacontacontactos;


        this.manager = new LinearLayoutManager(this);


        this.adaptadorobjeto = new adaptador(this.datasource);

        this.recycler.setHasFixedSize(true);
        this.recycler.setLayoutManager(this.manager);

        this.recycler.setAdapter(this.adaptadorobjeto);


    }
}
