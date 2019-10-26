package Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam2ee14i04001.R;

import java.util.List;

public class AdaptadorContactos extends RecyclerView.Adapter<viewHolderContactos> {

    //Declaracion de variables
    private List<Contactos> listContactos;

    public AdaptadorContactos(List<Contactos> datasources){
        //Inicializamos el datasources
        this.listContactos = datasources;
    }

    @NonNull
    @Override
    public viewHolderContactos onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Creamos la vista usando el Layout de plantilla
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla_contacto,parent,false);
        viewHolderContactos vhContactos = new viewHolderContactos(v);
        return vhContactos;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderContactos holder, int position) {
        //Establecemos la información del datasources al ViewHolder
        holder.getTxtNombre().setText(this.listContactos.get(position).getNombre());
        holder.getTxtApellido().setText(this.listContactos.get(position).getApellido());
        holder.getTxtTelefono1().setText(this.listContactos.get(position).getTelefono1());
        holder.getTxtTelefono2().setText(this.listContactos.get(position).getTelefono2());
    }

    @Override
    public int getItemCount() {
        return this.listContactos.size();
    }
}
