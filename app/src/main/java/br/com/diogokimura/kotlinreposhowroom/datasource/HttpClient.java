package br.com.diogokimura.kotlinreposhowroom.datasource;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class HttpClient {
    static Retrofit retrofit(){
        return new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(GitHubAPI.BASE_URL)
                .build();
    }
}
