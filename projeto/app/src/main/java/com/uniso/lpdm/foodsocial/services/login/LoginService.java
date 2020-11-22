package com.uniso.lpdm.foodsocial.services.login;


import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface LoginService {
    @Headers({
        "Content-Type: application/json"
    })
    @POST("login")
    Call<UsuarioLogin> fazLogin(@Body FormularioLogin formularioLogin);
}
