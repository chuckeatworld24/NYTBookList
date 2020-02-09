package com.example.andrew.nytapi.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CategoriesWrapper {


    @SerializedName("body")
    @Expose
    private Body body;


    public Body getBody() {
        return body;
    }


}
