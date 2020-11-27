package br.com.mlr.nolazy.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import br.com.mlr.nolazy.R;

public class AdapterAlarmes extends RecyclerView.Adapter<AdapterAlarmes.MyViewHolder> {

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.adapter_alarmes, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textLegenda.setText("Trabalho");
        holder.textHorario.setText("05:30 am");
    }

    @Override
    public int getItemCount() {
        return 5;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView textLegenda;
        TextView textHorario;
        Switch switchLigaDesliga;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textLegenda = itemView.findViewById(R.id.textLegenda);
            textHorario = itemView.findViewById(R.id.textHorario);
            switchLigaDesliga = itemView.findViewById(R.id.switchLigaDesliga);
        }
    }
}
