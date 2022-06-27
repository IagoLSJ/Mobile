package com.projeto.projeto_final.view.community;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.projeto.projeto_final.R;
import com.projeto.projeto_final.model.Comunidade;

import java.util.List;

public class CommunityAdapter extends RecyclerView.Adapter<CommunityAdapter.viewHolderCommunity> {
    private List<Comunidade> comunidadeList;

    public CommunityAdapter(List<Comunidade> comunidadeList) {
        this.comunidadeList = comunidadeList;
    }

    @NonNull
    @Override
    public viewHolderCommunity onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());

        View view = layoutInflater.inflate(R.layout.community_item,parent, false);

        viewHolderCommunity communityHolder = new viewHolderCommunity(view);
        return communityHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolderCommunity holder, int position) {
        if((comunidadeList != null) && (comunidadeList.size() > 0)){
            Comunidade comunidade = comunidadeList.get(position);
            holder.communityName.setText(comunidade.getNome());
            holder.communityDescription.setText(comunidade.getDescrição());


        }
    }

    @Override
    public int getItemCount() {
        return comunidadeList.size();
    }

    public class viewHolderCommunity extends RecyclerView.ViewHolder{
        public ImageView communityIcon;
        public TextView communityName, communityDescription;
        public viewHolderCommunity(@NonNull View itemView) {
            super(itemView);
            communityIcon = itemView.findViewById(R.id.communityIcon);
            communityName = itemView.findViewById(R.id.communityName);
            communityDescription = itemView.findViewById(R.id.communityDescription);
        }
    }
}
