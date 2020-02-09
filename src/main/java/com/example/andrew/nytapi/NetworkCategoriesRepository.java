package com.example.andrew.nytapi;

import android.util.Log;

import com.example.andrew.nytapi.Models.CategoriesWrapper;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public class NetworkCategoriesRepository implements CategoriesRepository {

    private final String API_KEY = "62410816fcef4823812ad6a8d03b18ec";

    private CategoriesApi categoriesApi;

    NetworkCategoriesRepository(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.nytimes.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        categoriesApi = retrofit.create(CategoriesApi.class);




    }


    public interface CategoriesApi {
        @GET("svc/books/lists/names.json")
        Call<CategoriesWrapper> listCategories(@Query("api-key") String apiKey);
    }

    @Override
    public void getCategories(final RepositoryCallbacks callbacks) {

        Call<CategoriesWrapper> call = categoriesApi.listCategories(API_KEY);


        call.enqueue(new Callback<CategoriesWrapper>() {
            @Override
            public void onResponse(Call<CategoriesWrapper> call, Response<CategoriesWrapper> response) {
                if (response.isSuccessful()) {
                    // tasks available
                    callbacks.onSuccess(response.body().getBody().getCategories());
                } else {
                    // error response, no access to resource?
                    callbacks.onError();
                }
            }

            @Override
            public void onFailure(Call<CategoriesWrapper> call, Throwable t) {
                // something went completely south (like no internet connection)
                callbacks.onError();
            }
        });


    }
}
