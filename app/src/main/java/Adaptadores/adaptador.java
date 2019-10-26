package Adaptadores;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exam2ee14i04001.R;

import java.util.List;

import entidades.objeto;

public class adaptador extends RecyclerView.Adapter<viewholderobjeto> {

    private List<objeto> listContactos;

    public adaptador(List<objeto> datasources){

        this.listContactos = datasources;
    }

    @NonNull
    @Override
    public viewholderobjeto onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.plantilla,parent,false);
        viewholderobjeto vhContactos = new viewholderobjeto(v);
        return vhContactos;
    }

    @Override
    public void onBindViewHolder(@NonNull viewholderobjeto holder, int position) {

        holder.getLblnombre().setText("Nombre: "+ this.listContactos.get(position).getNombre());
        holder.getLblapellido().setText("Apellido: "+ this.listContactos.get(position).getApellido());
        holder.getLbltelefono1().setText("Numero de telefono 1: "+ this.listContactos.get(position).getNumero1());
        holder.getLbltelefono2().setText("Numero de telefono 2: "+ this.listContactos.get(position).getNumero2());
        if (this.listContactos.get(position).getFavorito()==0)
        {
            holder.getLblfavorito().setText("No agregado como favorito");
        }
        else
        {
            holder.getLblfavorito().setText("Agregado en lista de favoritos");
        }


    }

    @Override
    public int getItemCount() {
        return this.listContactos.size();
    }
}
