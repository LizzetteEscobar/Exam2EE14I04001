package com.example.exam2ee14i04001;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.exam2ee14i04001.MainActivity.listaDatos;

public class AgregarContacto extends AppCompatActivity {

    private TextView txtNombreContacto;
    private TextView txtApellidoContacto;
    private TextView txtTelefono1;
    private TextView txtTelefono2;
    private Button btnAgregar;
    boolean isActivo = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_contacto);

        this.txtApellidoContacto = findViewById(R.id.txtApellido);
        this.txtNombreContacto = findViewById(R.id.txtNombre);
        this.txtTelefono1 = findViewById(R.id.txtTelef1);
        this.txtTelefono2 = findViewById(R.id.txtTelef2);
        this.btnAgregar = findViewById(R.id.btnGuardar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                guardarContacto();
            }
        });
    }

    public void guardarContacto(){
        if(txtNombreContacto.getText().toString().isEmpty()){
            Toast.makeText(this, "La lista esta vacia", Toast.LENGTH_LONG).show();
        } else if(!isActivo){

            listaDatos.add(txtNombreContacto.getText().toString() + " " + txtApellidoContacto.getText().toString() + " " + txtTelefono1.getText().toString()+ " " + txtTelefono2.getText().toString());

            Toast.makeText(this, "Encuesta ingresada con exito", Toast.LENGTH_LONG).show();
            isActivo = true;
            finish();
        }
    }
}
