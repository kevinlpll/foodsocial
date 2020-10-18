package br.foodsocial;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="CATEGORIA",schema="dbo")
public class Categoria {

    @Id
    @Column(name="ID_CATEGORIA")
    private int idCategoria;

    @Column(name="DESCRICAO")
    private String descricao;

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
