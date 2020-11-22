package com.uniso.lpdm.foodsocial.services;

import com.uniso.lpdm.foodsocial.services.cadastro.CadastroService;
import com.uniso.lpdm.foodsocial.services.login.LoginService;

import retrofit2.Retrofit;
import retrofit2.converter.jackson.JacksonConverterFactory;



public class RetrofitConfig {
    private final Retrofit retrofit;
    public RetrofitConfig(){
        this.retrofit =  new Retrofit.Builder().baseUrl("http://foodsocial-env.eba-7aqppnqr.us-east-2.elasticbeanstalk.com/")
            .addConverterFactory(JacksonConverterFactory.create())
            .build();
    }

    public LoginService postLoginService (){
        return this.retrofit.create(LoginService.class);
    }

    public CadastroService postCadastroService(){
        return this.retrofit.create(CadastroService.class);

    }
}
