package com.uniso.lpdm.foodsocial.services.publicacao;

import com.uniso.lpdm.foodsocial.PublicacaoListar;
import com.uniso.lpdm.foodsocial.Usuario;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;


public interface PublicacaoService {
    @Headers({
            "Content-Type: application/json"
    })
    @GET("publicacoes")
    Call<List<PublicacaoListar>> obterPublicacoes();
}