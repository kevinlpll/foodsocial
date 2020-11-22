package com.uniso.lpdm.foodsocial.services.cadastro;


import com.uniso.lpdm.foodsocial.Usuario;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface CadastroService {
    @Headers({
            "Content-Type: application/json"
    })
    @POST("usuario")
    Call<ResponseBody> criaUsuario(@Body Usuario usuario);
}
