/************** Participantes do projeto **************
 *Nome:                                              RA
 * Breno Vieira Castanho                             00096335
 * Danilo de Sousa Nogueira                          00096122
 * José Vitor Alves Pignataro                        00096150
 * Kevin Lopes Paschoal                              00097685
 * Reinaldo de Araújo Sandim Neto                    00096475
 * Lauro isaac lepinsky                             00096279
 * */
package com.uniso.lpdm.foodsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.uniso.lpdm.foodsocial.services.login.FormularioLogin;
import com.uniso.lpdm.foodsocial.services.RetrofitConfig;
import com.uniso.lpdm.foodsocial.services.login.UsuarioLogin;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Foodsocial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        final TextView link_cadastrar = findViewById(R.id.link_cadastrar);
        final EditText username = findViewById(R.id.username);
        final EditText senha = findViewById(R.id.password);
        Button btnLogin = findViewById(R.id.btn_login);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_SHORT;



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {


                FormularioLogin formularioLogin = new FormularioLogin(username.getText().toString(),senha.getText().toString());
                Call<UsuarioLogin> call = new RetrofitConfig().postLoginService().fazLogin(formularioLogin);
                final Intent intent = new Intent(v.getContext(),TelaFeedPublicacao.class);

                call.enqueue(new Callback<UsuarioLogin>() {
                    @Override
                    public void onResponse(Call<UsuarioLogin> call, Response<UsuarioLogin> response) {


                        UsuarioLogin usuarioLogin = new UsuarioLogin(
                                response.body().getIdUsuario(),
                                response.body().getPrimeiroNome(),
                                response.body().getSobrenome(),
                                response.body().getNomeUsuario(),
                                response.body().getDescricaoPerfil()
                                );

                        Log.d("respostaJackson",usuarioLogin.getPrimeiroNome());

                        v.getContext().startActivity(intent);
                    }

                    @Override
                    public void onFailure(Call<UsuarioLogin> call, Throwable t) {
                        Toast toast = Toast.makeText(context,"Usuário e/ou senha incorretos",duration);
                        toast.show();
                        Log.e("Resposta Login",t.getMessage());
                    }
                });
            }
        });
    }

    public void irCadastro(View view) {
        Intent intent = new Intent(this,TelaCadastro.class);
        startActivity(intent);
    }
    public void Irfeed(View view) {
        Intent intent = new Intent(this,TelaFeedPublicacao.class);
        startActivity(intent);
    }


}