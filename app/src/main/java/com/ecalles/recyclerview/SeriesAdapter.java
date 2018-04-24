package com.ecalles.recyclerview;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by UCA on 18/04/2018.
 */

public class SeriesAdapter extends RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder>{

    private ArrayList<Serie> series;

    @Override
    public SeriesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_cardview,parent,false);
        return (new SeriesViewHolder(v));
    }

    @Override
    public void onBindViewHolder(final SeriesViewHolder holder, final int position) {
        holder.name.setText((series.get(position).getName()));
        holder.img.setImageResource(series.get(position).getImg());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Serie notificacion;
                Toast.makeText(view.getContext(),series.get(position).getName(),Toast.LENGTH_SHORT).show();
                
            }
        });
    }

    @Override
    public int getItemCount() {
        return series.size();
    }

    public static class SeriesViewHolder extends RecyclerView.ViewHolder{
        CardView card;
        TextView name;
        ImageView img;
        Button btn;

        public SeriesViewHolder(View itemView){
            super(itemView);

            btn = itemView.findViewById(R.id.btn);
            card=itemView.findViewById(R.id.card_view);
            name=itemView.findViewById(R.id.name);
            img=itemView.findViewById(R.id.img);
        }
    }
    public SeriesAdapter(ArrayList<Serie> series){
        this.series=series;
    }


}
