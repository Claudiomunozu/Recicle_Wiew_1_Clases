package com.example.recicle_wiew_1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recicle_wiew_1.databinding.WordItemListBinding;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    //paso 1 añadir representacion datos

    private List<String> mWordList;


    //metodo que recibe una lista  desde el fragmento
    public WordAdapter(List<String>mWordList){
        this.mWordList = mWordList;



    }

    //metodo encargado de inflar vista de recicle
    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        WordItemListBinding mBinding = WordItemListBinding.inflate(LayoutInflater.from(parent.getContext()),
                parent, false);

                return new WordViewHolder(mBinding);
    }


    //encargado de recibir los datos del diseño desde metodo anterior y setea valores al textview
    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {

        String element = mWordList.get(position);
        holder.textView.setText(element);


    }

    //lleva cuenta de cuantas van
    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    //paso 2 clase interna que representa la vista Word_item_list.xml
    // inicializamos textview que es dentro del xml y llamamos mbinding que es la clase xml que contiene
    public class WordViewHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public WordViewHolder(@NonNull WordItemListBinding mBinding) {
            super(mBinding.getRoot());
            textView = mBinding.textView;
        }
    }

}
