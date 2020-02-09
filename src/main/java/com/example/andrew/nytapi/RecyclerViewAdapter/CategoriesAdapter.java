package com.example.andrew.nytapi.RecyclerViewAdapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.andrew.nytapi.Models.Category;
import com.example.andrew.nytapi.R;

import java.util.ArrayList;
import java.util.List;

public class CategoriesAdapter extends RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder> {

    public List<Category> categories = new ArrayList<>();

    public CategoriesAdapter(){}


    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_category, parent, false);

        return new CategoryViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        Category category = categories.get(position);

        categoryViewHolder.bind(category);
    }


    @Override
    public int getItemCount() {

        return categories.size();
    }


    public void updateCategories(List<Category> categories){
        this.categories = categories;

        notifyDataSetChanged();
    }




    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        TextView displayName;
        TextView lastUpdatedDate;
        TextView updatedFrequency;

        public CategoryViewHolder(View itemView) {
            super(itemView);

            displayName = itemView.findViewById(R.id.displayName);
            lastUpdatedDate = itemView.findViewById(R.id.lastUpdatedDate);
            updatedFrequency = itemView.findViewById(R.id.updatedFrequency);

        }

        public void bind (Category category) {
            displayName.setText(category.getDisplayName());
            lastUpdatedDate.setText(category.getNewestPublishedDate());
            updatedFrequency.setText(category.getUpdated());
        }
    }


}
