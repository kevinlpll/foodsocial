package com.uniso.lpdm.foodsocial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

public class TelaPublicacao extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_publicacao);
        getSupportActionBar().hide();
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

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


    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    public void abrirCamera(View view){
        dispatchTakePictureIntent();
    }
}