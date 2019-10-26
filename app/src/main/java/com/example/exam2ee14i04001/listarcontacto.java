package com.example.exam2ee14i04001;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.exam2ee14i04001.R;
import Adaptadores.adaptador;
import entidades.objeto;

import static com.example.exam2ee14i04001.MainActivity.listacontacontactos;

public class listarcontacto extends AppCompatActivity implements View.OnClickListener {


    RecyclerView recycler;
    List<objeto> datasource = new ArrayList<>();
    LinearLayoutManager manager;
    adaptador adaptadorobjeto;
    EditText eliminar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listarcontacto);
        eliminar = findViewById(R.id.txteliminar);

        recycler = findViewById(R.id.recycler);

        cargardatos();

        Toast.makeText(this, "Hola ",Toast.LENGTH_SHORT ).show();

        this.manager = new LinearLayoutManager(this);


        this.adaptadorobjeto = new adaptador(this.datasource);

        this.recycler.setHasFixedSize(true);
        this.recycler.setLayoutManager(this.manager);

        this.recycler.setAdapter(this.adaptadorobjeto);
    }

    void eliminarcontacto(String nombre)
    {

        for(int i = 0; i<listacontacontactos.size(); i++)
        {

            if( nombre.equals(listacontacontactos.get(i).getNombre()) )
            {
                listacontacontactos.remove(i);
                datasource=listacontacontactos;
                this.manager = new LinearLayoutManager(this);


                this.adaptadorobjeto = new adaptador(this.datasource);

                // adaptamos los datos
                this.recycler.setAdapter(this.adaptadorobjeto);
                Toast.makeText(this,"contacto eliminado",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(this,"no se ha podido eliminar",Toast.LENGTH_SHORT).show();
            }
        }
    }

    void cargardatos()

    {

        for(int i =0; i<listacontacontactos.size(); i++)
        {
            datasource.add(listacontacontactos.get(i));
        }

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {

            case R.id.btneliminar:
            {
                String elimi = eliminar.getText().toString();
                eliminarcontacto(elimi);
                break;
            }
        }
    }
}
