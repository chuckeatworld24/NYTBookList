package com.example.andrew.nytapi;

interface RepositoryCallbacks <T>{
    void onSuccess(T results);
    void onError();

}
