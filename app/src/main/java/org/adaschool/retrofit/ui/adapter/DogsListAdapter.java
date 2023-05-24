package org.adaschool.retrofit.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.adaschool.retrofit.R;
import org.adaschool.retrofit.network.dto.DogBreed;

import java.util.ArrayList;
import java.util.List;

public class DogsListAdapter extends RecyclerView.Adapter<DogsListAdapter.DogViewHolder> {


    private List<DogBreed> dogs = new ArrayList<>();

    @NonNull
    @Override
    public DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dog_row, parent, false);
        return new DogViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DogViewHolder holder, int position) {
        DogBreed dog = dogs.get(position);
        holder.breedName.setText(dog.getName());
        Glide.with(holder.itemView.getContext())
                .load(dog.getImageUrl())
                .into(holder.dogImage);
    }

    @Override
    public int getItemCount() {
        return dogs.size();
    }

    public void update(List<DogBreed> dogs) {
        this.dogs = dogs;
        notifyDataSetChanged();
    }

    static class DogViewHolder extends RecyclerView.ViewHolder {

        TextView breedName;
        ImageView dogImage;

        public DogViewHolder(@NonNull View itemView) {
            super(itemView);
            breedName = itemView.findViewById(R.id.breedName);
            dogImage = itemView.findViewById(R.id.dogImage);
        }

    }
}
