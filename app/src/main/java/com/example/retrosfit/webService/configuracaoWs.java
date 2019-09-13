package com.example.retrosfit.webService;

import com.example.retrosfit.model.Login;

import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

public interface configuracaoWs {

    @GET("/ServiceTeste/rest/cliente/{usuario}")
    Call<Login> getUsuario(@Path("usuario") String usuario);


    Retrofit retrofit = new Retrofit
            .Builder()
            .baseUrl("http://10.12.5.163:8080/ServiceTeste/rest/cliente/user")
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @POST("/ServiceTeste/rest/cliente/teste")
    Call<Login> createUser(@Body Login user);
}
