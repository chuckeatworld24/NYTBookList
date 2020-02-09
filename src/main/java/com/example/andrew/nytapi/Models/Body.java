package com.example.andrew.nytapi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Body {



        @SerializedName("results")
        @Expose
        private List<Category> categories = null;



    public List<Category> getCategories() {
        return categories;
    }
}
