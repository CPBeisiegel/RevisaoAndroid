package com.example.revisao.views.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.revisao.R;
import com.example.revisao.views.activity.StartActivity;

import static com.example.revisao.views.activity.HomeActivity.BANDA_TK;

/**
 * A simple {@link Fragment} subclass.
 */
public class ImagemBandaFragment extends Fragment {
    private TextView txtNomeBanda;
    private Button btnVoltar;

    public ImagemBandaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_imagem_banda, container, false);
        initViews(view);


        //Implementar a lógica de verificação dos dados recebidos e setar o nome da banda no textView
        if(!getArguments().isEmpty()){
            String banda = getArguments().getString(BANDA_TK);
            txtNomeBanda.setText(banda);

            // eu queria colocar uma imagem e aplicar isso
//
//            if(BANDA_TK != null){
//
//                Drawable drawable = getResources().getDrawable(sistemaOperacional.getImagem());
//
//                imagem.setImageDrawable(drawable);
//                txtNome.setText(sistemaOperacional.getNome());
//            }


        }



        //Implementar a lógica de ação do botão voltar
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), StartActivity.class));
            }
        });
        return view;

    }

    private void initViews(View view) {
        txtNomeBanda = view.findViewById(R.id.textViewNomeBanda);
        btnVoltar = view.findViewById(R.id.btnVoltar);

    }


}
