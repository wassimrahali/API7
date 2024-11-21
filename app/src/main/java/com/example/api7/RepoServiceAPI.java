package com.example.api7;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RepoServiceAPI {
    String BASE_URL = "http://192.168.1.2:8686/";

    @GET("produits/listes/")
    Call<List<Produit>> Affichage();
}


