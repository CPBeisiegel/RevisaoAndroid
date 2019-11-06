package com.example.revisao.views.adpaters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.revisao.R;
import com.example.revisao.views.interfaces.RecycleViewOnClick;
import com.example.revisao.views.model.Music;

import java.util.List;


public class MusicAdapter extends RecyclerView.Adapter <MusicAdapter.ViewHolder> {

    private List<Music> musics;
    private RecycleViewOnClick listener;

    public MusicAdapter(List<Music>musics,RecycleViewOnClick listener) {
        this.musics = musics;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_musica, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Music music = musics.get(position);
        holder.onBind(music);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onClick(music);
            }
        });

    }

    @Override
    public int getItemCount() {
        return musics.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView textViewDetalhe;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewDetalhe = itemView.findViewById(R.id.itemListaAlbum);
        }

        public void onBind(Music music) {
            textViewDetalhe.setText(music.getMusic());
        }
    }
}




