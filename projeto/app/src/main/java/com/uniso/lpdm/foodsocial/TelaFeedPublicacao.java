package com.uniso.lpdm.foodsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.uniso.lpdm.foodsocial.services.RetrofitConfig;
import com.uniso.lpdm.foodsocial.services.login.FormularioLogin;
import com.uniso.lpdm.foodsocial.services.login.UsuarioLogin;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TelaFeedPublicacao extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_feed_publicacao);
        getSupportActionBar().hide();

        Call<List<com.uniso.lpdm.foodsocial.PublicacaoListar>> call = new RetrofitConfig().getPublicacaoService().obterPublicacoes();


        call.enqueue(new Callback<List<com.uniso.lpdm.foodsocial.PublicacaoListar>>() {
            @Override
            public void onResponse(Call<List<com.uniso.lpdm.foodsocial.PublicacaoListar>> call, Response<List<com.uniso.lpdm.foodsocial.PublicacaoListar>> response) {
                Log.d("IDUsuarioPublicacao ",response.body().get(0).getIdUsuario().toString());
                Log.d("TituloPublicacao" ,response.body().get(0).getTitulo());

            }

            @Override
            public void onFailure(Call<List<com.uniso.lpdm.foodsocial.PublicacaoListar>> call, Throwable t) {
//                Toast toast = Toast.makeText(context,"Usuário e/ou senha incorretos",duration);
//                toast.show();
//                Log.e("Resposta Login",t.getMessage());
            }
        });

    }

    public void IrPublicacao(View view) {
        Intent intent = new Intent(this,TelaPublicacao.class);
        startActivity(intent);
    }
    public void IrPerfil(View view){
        Intent intent = new Intent(this,TelaPerfil.class);
        startActivity(intent);
    }

}