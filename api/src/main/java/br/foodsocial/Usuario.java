package br.foodsocial;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="USUARIO",schema="dbo")
public class Usuario {

    @Id
    @Column(name="ID_USUARIO")
    private int idUsuario;

    @Column(name="NOME")
    private String primeiroNome;

    @Column(name="SOBRENOME")
    private String sobrenome;

    @Column(name="USERNAME")
    private String nomeUsuario;

    @Column(name="DESCRICAO_PERFIL")
    private String descricaoPerfil;

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }
}
