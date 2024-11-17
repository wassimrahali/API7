package com.example.api7;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RepoServiceAPI {
    String BASE_URL = "https://foodie-back.up.railway.app/api/";

    @GET("products")
    Call<List<Produit>> Affichage();
}
