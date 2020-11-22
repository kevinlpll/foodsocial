package com.uniso.lpdm.foodsocial;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"descricaoPerfil"})
public class Usuario {

    //propriedades
    private int idUsuario;
    private String primeiroNome;
    private String sobrenome;
    private String nomeUsuario;
    private String descricaoPerfil;
    private String senha;

    public Usuario(String primeiroNome,String sobrenome,String nomeUsuario,String senha){
        this.setPrimeiroNome(primeiroNome);
        this.setSobrenome(sobrenome);
        this.setNomeUsuario(nomeUsuario);
        this.setSenha(senha);
    }

    public Usuario(int idUsuario,String primeiroNome,String sobrenome,String nomeUsuario){
        this.setPrimeiroNome(primeiroNome);
        this.setSobrenome(sobrenome);
        this.setNomeUsuario(nomeUsuario);
        this.setIdUsuario(idUsuario);
    }


    //getters e setters
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }
}
