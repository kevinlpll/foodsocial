package com.uniso.lpdm.foodsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.uniso.lpdm.foodsocial.services.RetrofitConfig;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class TelaCadastro extends AppCompatActivity {

    private Button btnCadastrar; //= findViewById(R.id.btn_cadastrar);
    private EditText editNome; //= findViewById(R.id.nome);
    private EditText editSobrenome;//= findViewById(R.id.sobrenome);
    private EditText editSenha; //= findViewById(R.id.senha);
    private EditText editConfirmarSenha; //= findViewById(R.id.confirmar_senha);
    private EditText editUsername;// = findViewById(R.id.username);



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastro);
        getSupportActionBar().hide();




        btnCadastrar = findViewById(R.id.btn_cadastrar);
        editNome = findViewById(R.id.nome);
        editSobrenome = findViewById(R.id.sobrenome);
        editSenha = findViewById(R.id.senha);
        editConfirmarSenha = findViewById(R.id.confirmar_senha);
        editUsername = findViewById(R.id.username);

//        btnCadastrar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(final View view) {
//
//
//            }
//        });
    }



    public void irLogin(View view){
        Intent intent = new Intent(this,Foodsocial.class);
        startActivity(intent);
    }

    public void onClickCadastrar(View view){
        final Context context = view.getContext();
        final Intent intent = new Intent(context,Foodsocial.class);

        Log.d("EditSenhaVazio",String.valueOf(editSenha.getText().equals("")));

        Log.d("confirmarSenha",String.valueOf(editConfirmarSenha.getText().toString().equals(editSenha.getText().toString())));
        if(editConfirmarSenha.getText().toString().equals(editSenha.getText().toString()) && !editSenha.getText().equals("")){
            Usuario usuario = new Usuario(
                    editNome.getText().toString(),
                    editSobrenome.getText().toString(),
                    editUsername.getText().toString(),
                    editSenha.getText().toString()

            );




            Call<ResponseBody> call = new RetrofitConfig().postCadastroService().criaUsuario(usuario);
            call.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {


                    if(response.code() == 200){
                        context.startActivity(intent);
                    }else if(response.code() == 409) {
                        Toast toast = Toast.makeText(context, "Nome de usuário já utilizado", Toast.LENGTH_SHORT);
                        toast.show();

                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    Log.e("Faio",t.getMessage());
                }
            });
        }else if (
            editSenha.getText().equals("") ||
            editConfirmarSenha.getText().equals("") ||
            editUsername.getText().equals("") ||
            editNome.getText().equals("") ||
            editSobrenome.getText().equals("")
        ){
            Toast toast = Toast.makeText(context, "Preencha todos os campos!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


//    public void Irfeed(View view) {
//        Intent intent = new Intent(this,TelaFeedPublicacao.class);
//        startActivity(intent);
//    }
}