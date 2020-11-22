package br.foodsocial;

import javax.persistence.*;

@Entity
@Table(name="PUBLICACAO",schema = "dbo")
public class Publicacao {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="ID_PUBLICACAO")
    private int idPublicacao;

    @Column(name="TITULO")
    private String titulo;

    @Column(name="INGREDIENTES")
    private String ingredientes;

    @Column(name="MODO_PREPARO")
    private String modoPreparo;

    @Column(name="ID_USUARIO")
    private int idUsuario;

    @Column(name="FOTO")
    private String foto;


    public int getIdPublicacao() {
        return idPublicacao;
    }

    public void setIdPublicacao(int idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
