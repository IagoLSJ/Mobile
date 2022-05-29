package com.projeto.createcar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projeto.createcar.model.Carro;

import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter<CarroAdapter.viewHolderCarro> {

    private List<Carro> dados;

    public CarroAdapter(List<Carro> dados){
        this.dados = dados;
    }

    @NonNull
    @Override
    public CarroAdapter.viewHolderCarro onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.item_lista,parent, false);

        viewHolderCarro holderCarro = new viewHolderCarro(view);
        return holderCarro;
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdapter.viewHolderCarro holder, int position) {

        if((dados != null) && (dados.size() > 0)){
            Carro carro = dados.get(position);

            holder.nome.setText(carro.getNome());
            holder.marca.setText(carro.getMarca());
            holder.modelo.setText(carro.getModelo());
            holder.ano.setText(carro.getAno());
            holder.id.setText(Integer.toString(carro.getId()));

        }


    }

    @Override
    public int getItemCount() {
        return dados.size();
    }

    public class viewHolderCarro extends RecyclerView.ViewHolder{
        public TextView car_icon;
        public TextView nome;
        public TextView marca;
        public TextView modelo;
        public TextView ano;
        public TextView id;
        public viewHolderCarro(@NonNull View itemView) {
            super(itemView);
            car_icon = itemView.findViewById(R.id.car_icon);
            nome = (TextView) itemView.findViewById(R.id.item_nome_carro);
            marca = (TextView)itemView.findViewById(R.id.item_marca_carro);
            modelo = (TextView) itemView.findViewById(R.id.item_modelo_carro);
            ano = (TextView) itemView.findViewById(R.id.item_ano_carro);
            id =  itemView.findViewById(R.id.item_id_carro);
        }


    }

}
