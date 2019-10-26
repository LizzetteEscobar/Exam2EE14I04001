package com.example.exam2ee14i04001;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import entidades.objeto;

import static com.example.exam2ee14i04001.MainActivity.listacontacontactos;

public class agregarcontacto extends AppCompatActivity implements View.OnClickListener {

    Button agregar;
    EditText nombre, apellido, telefono1, telefono2;
    CheckBox favorito;

    int seleccionfavorito=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregarcontacto);

        agregar = findViewById(R.id.btnagregar);
        nombre= findViewById(R.id.txtnombre);
        apellido= findViewById(R.id.txtapellido);
        telefono1= findViewById(R.id.txttelefono1);
        telefono2= findViewById(R.id.txttelefono2);
        favorito= findViewById(R.id.chfavorito);


        // metodo check
        this.favorito.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                //Asignamos el valor del Check
               seleccionfavorito=1;

            }
        });
        //fin del check

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnagregar:
            {
               String stnombre = nombre.getText().toString();
                String stapellido = apellido.getText().toString();
                String sttelefono1 = telefono1.getText().toString();
                String sttelefono2 = telefono2.getText().toString();
                int fav = seleccionfavorito;

                if( stnombre.isEmpty() || stapellido.isEmpty() || sttelefono1.isEmpty() || sttelefono2.isEmpty()  )
                {
                    Toast.makeText(this,"porfavor llene todos los campos",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    listacontacontactos.add(new objeto(stnombre,stapellido,Integer.parseInt(sttelefono1),Integer.parseInt(sttelefono2),fav));
                    Toast.makeText(this,"contacto agregado con exito ",Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        }
    }
}
