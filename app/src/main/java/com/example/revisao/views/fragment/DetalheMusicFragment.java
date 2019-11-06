package com.example.revisao.views.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.revisao.R;
import com.example.revisao.views.model.Music;

import static com.example.revisao.views.fragment.ListaMusicaFragment.MUSIC;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetalheMusicFragment extends Fragment {

    private TextView txtMusicNome;
    private TextView txtMusicDetalhe;

    public TextView getTxtMusicNome() {
        return txtMusicNome;
    }

    public void setTxtMusicNome(TextView txtMusicNome) {
        this.txtMusicNome = txtMusicNome;
    }

    public TextView getTxtMusicDetalhe() {
        return txtMusicDetalhe;
    }

    public void setTxtMusicDetalhe(TextView txtMusicDetalhe) {
        this.txtMusicDetalhe = txtMusicDetalhe;
    }

    public DetalheMusicFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalhe_music, container, false);

        initViews (view);

            if(getArguments() != null){

                Music music = getArguments().getParcelable(MUSIC);

                txtMusicNome.setText(music.getMusic());
                txtMusicDetalhe.setText(music.getAlbum());
            }

        return view;
    }

    private void initViews(View view) {
        txtMusicNome = view.findViewById(R.id.textViewDetalhe);
        txtMusicDetalhe = view.findViewById(R.id.textViewMusicDetalhe);
    }

}
