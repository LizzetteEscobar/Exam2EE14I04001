package com.example.exam2ee14i04001;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import entidades.objeto;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static List<objeto> listacontacontactos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // validando lista
        if(listacontacontactos == null)
        {
            listacontacontactos = new ArrayList<>();
        }

        else
        {

        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnagregarcontacto:
            {
                Intent as = new Intent(this,agregarcontacto.class);
                startActivity(as);
                break;
            }
            case R.id.btnlistarcontacto:
            {
                if(listacontacontactos == null || listacontacontactos.size()==0)
                {
                    Toast.makeText(this,"Agregue contactos", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent asw = new Intent(this,listarcontacto.class);
                    startActivity(asw);
                }

                break;
            }
            case R.id.btnlistarordenados:
            {
                if(listacontacontactos==null || listacontacontactos.size()==0)
                {
                    Toast.makeText(this,"Agregue contactos", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent asg= new Intent(this,listarordenados.class);
                    startActivity(asg);
                }

                break;
            }
        }
    }
}
