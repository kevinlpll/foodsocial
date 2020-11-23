package com.uniso.lpdm.foodsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaFavorito extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_favorito);
    }

    public void IrPerfil(View view){
        Intent intent = new Intent(this,TelaPerfil.class);
        startActivity(intent);
    }

    public void IrFeedPublicacao(View view){
        Intent intent = new Intent(this,TelaFeedPublicacao.class);
        startActivity(intent);
    }

    public void IrPublicacao(View view) {
        Intent intent = new Intent(this,TelaPublicacao.class);
        startActivity(intent);
    }

}