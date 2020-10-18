package com.uniso.lpdm.foodsocial;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface LoginService {
    @Headers({
        "Content-Type: application/json"
    })
    @POST("login")
    Call<Usuario> fazLogin(@Body FormularioLogin formularioLogin);
}
