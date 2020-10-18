package com.uniso.lpdm.foodsocial;

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
}
