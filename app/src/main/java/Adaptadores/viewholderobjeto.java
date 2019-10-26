package Adaptadores;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam2ee14i04001.R;

public class viewholderobjeto extends RecyclerView.ViewHolder {

    // declaracion de variables
    private TextView lblnombre;
    private TextView lblapellido;
    private TextView lbltelefono1;
    private TextView lbltelefono2;
    private TextView lblfavorito;

    public viewholderobjeto(@NonNull View itemView) {
        super(itemView);

        // los controles
        this.lblnombre=((itemView.findViewById(R.id.lblnombre)));
        this.lblapellido=((itemView.findViewById(R.id.lblapellido)));
        this.lbltelefono1=((itemView.findViewById(R.id.lbltelefono1)));
        this.lbltelefono2=((itemView.findViewById(R.id.lbltelefono2)));
        this.lblfavorito=((itemView.findViewById(R.id.lblfavorito)));



    }

    public TextView getLblnombre() {
        return lblnombre;
    }


    public TextView getLblapellido() {
        return lblapellido;
    }


    public TextView getLbltelefono1() {
        return lbltelefono1;
    }



    public TextView getLbltelefono2() {
        return lbltelefono2;
    }


    public TextView getLblfavorito() {
        return lblfavorito;
    }

}
