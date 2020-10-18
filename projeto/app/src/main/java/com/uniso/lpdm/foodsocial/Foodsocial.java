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

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Foodsocial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView link_cadastrar = findViewById(R.id.link_cadastrar);
        final EditText username = findViewById(R.id.username);
        final EditText senha = findViewById(R.id.password);
        Button btnLogin = findViewById(R.id.btn_login);

        final Context context = getApplicationContext();

        final int duration = Toast.LENGTH_SHORT;



        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Intent intent = new Intent();
                FormularioLogin formularioLogin = new FormularioLogin(username.getText().toString(),senha.getText().toString());
                Call<Usuario> call = new RetrofitConfig().postLoginService().fazLogin(formularioLogin);

                call.enqueue(new Callback<Usuario>() {
                    @Override
                    public void onResponse(Call<Usuario> call, Response<Usuario> response) {

                        Usuario usuario = response.body();

                        Toast toast = Toast.makeText(context,"Usuário autenticado com sucesso",duration);
                        toast.show();
//                        if(response != null){
//                            Log.d("Login ","Autenticado com sucesso!");
//                        }else{
//                            Log.d("Login ","Usuario e/ou senha invalidos");
//                        }

                    }

                    @Override
                    public void onFailure(Call<Usuario> call, Throwable t) {
                        Toast toast = Toast.makeText(context,"Usuário e/ou senha incorretos",duration);
                        toast.show();
                    }
                });
            }
        });
    }

    public void irCadastro(View view) {
        Intent intent = new Intent(this,TelaCadastro.class);
        startActivity(intent);
    }






}