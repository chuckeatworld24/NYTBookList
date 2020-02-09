package com.example.andrew.nytapi;

import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.example.andrew.nytapi.Models.Category;
import com.example.andrew.nytapi.RecyclerViewAdapter.CategoriesAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private CategoriesAdapter adapter;
    private CategoriesRepository categoriesRepository;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        categoriesRepository = new NetworkCategoriesRepository();

        recyclerView = findViewById(R.id.categoriesRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        progressBar = findViewById(R.id.progressBar);
        progressBar.setVisibility(View.VISIBLE);

        adapter = new CategoriesAdapter();
        recyclerView.setAdapter(adapter);

        categoriesRepository.getCategories(new RepositoryCallbacks() {

            @Override
            public void onSuccess(Object results) {
                progressBar.setVisibility(View.GONE);
                adapter.updateCategories((List<Category>) results);
            }

            @Override
            public void onError() {
                progressBar.setVisibility(View.GONE);
            }
        });
    }





    @Override
    public void onSaveInstanceState(Bundle outState) {


        super.onSaveInstanceState(outState);

    }





}
