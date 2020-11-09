package br.foodsocial;

import javax.persistence.*;

@Entity
@Table(name="USUARIO",schema="dbo")
public class Usuario {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="ID_USUARIO")
    private int idUsuario;



    @Column(name="NOME")
    private String primeiroNome;



    @Column(name="SOBRENOME")
    private String sobrenome;

    @Column(name="USERNAME", unique = true)
    private String nomeUsuario;

    @Column(name="DESCRICAO_PERFIL")
    private String descricaoPerfil;

    @Column(name="SENHA")
    private String senha;


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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
