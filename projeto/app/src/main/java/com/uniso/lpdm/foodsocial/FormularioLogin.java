package com.uniso.lpdm.foodsocial;

public class FormularioLogin {

    public FormularioLogin(String username,String senha){
        this.username = username;
        this.senha = senha;
    }

    private String username;
    private String senha;

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }
}
