package com.example.exam2ee14i04001;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.exam2ee14i04001.MainActivity.listaDatos;
public class ListaContactos extends AppCompatActivity {

    //Declaracion de variables
    ListView lstDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_contactos);

        if(listaDatos == null || listaDatos.size() == 0){
            Toast.makeText(this, "La lista esta vacia", Toast.LENGTH_LONG);
        } else{
            lstDatos.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listaDatos));
        }
    }
}
