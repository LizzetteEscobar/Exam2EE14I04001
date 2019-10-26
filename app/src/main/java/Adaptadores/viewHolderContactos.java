package Adaptadores;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam2ee14i04001.R;

public class viewHolderContactos extends RecyclerView.ViewHolder {
    //Declaracion de variables
    private TextView txtNombre, txtApellido;
    private TextView txtTelefono1, txtTelefono2;
    private ImageView imgLike;
    private ImageView imgUser;


    public viewHolderContactos(@NonNull View itemView) {
        super(itemView);

        //Obtenemos los controles
        this.txtNombre = itemView.findViewById(R.id.txtNombre);
        this.txtApellido = itemView.findViewById(R.id.txtApellido);
        this.txtTelefono1 = itemView.findViewById(R.id.txtTelef1);
        this.txtTelefono2 = itemView.findViewById(R.id.txtTelef2);
        this.imgLike = itemView.findViewById(R.id.imgLike);
        this.imgUser = itemView.findViewById(R.id.imgUser);
    }

    public TextView getTxtNombre() {
        return txtNombre;
    }

    public TextView getTxtApellido() {
        return txtApellido;
    }

    public TextView getTxtTelefono1() {
        return txtTelefono1;
    }

    public TextView getTxtTelefono2() {
        return txtTelefono2;
    }

    public ImageView getImgLike() {
        return imgLike;
    }

    public ImageView getImgUser() {
        return imgUser;
    }
}
