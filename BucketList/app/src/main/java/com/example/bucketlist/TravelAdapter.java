package com.example.bucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.TravelViewHolder>{

    Travel[] travels;

    public TravelAdapter(Travel[] travels) {
        this.travels = travels;
    }

    @NonNull
    @Override
    public TravelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.travel_list,parent,false);

        return new TravelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TravelViewHolder holder, int position) {
        holder.bind(travels[position]);
    }

    @Override
    public int getItemCount() {
        return travels.length;
    }

    class TravelViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        ImageView image;

        public TravelViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.text_view_name);
            image = itemView.findViewById(R.id.image_view_image);
        }
        public void bind(Travel travel){
            name.setText(travel.name);
            image.setImageResource(travel.image);
        }


    }
}
