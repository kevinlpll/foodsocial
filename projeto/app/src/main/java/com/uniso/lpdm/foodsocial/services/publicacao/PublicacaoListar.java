

package com.uniso.lpdm.foodsocial;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "idPublicacao",
        "titulo",
        "ingredientes",
        "modoPreparo",
        "idUsuario",
        "foto"
})
public class PublicacaoListar {

    @JsonProperty("idPublicacao")
    private Integer idPublicacao;
    @JsonProperty("titulo")
    private String titulo;
    @JsonProperty("ingredientes")
    private String ingredientes;
    @JsonProperty("modoPreparo")
    private String modoPreparo;
    @JsonProperty("idUsuario")
    private Integer idUsuario;
    @JsonProperty("foto")
    private String foto;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public PublicacaoListar() {
    }

    /**
     *
     * @param modoPreparo
     * @param ingredientes
     * @param foto
     * @param idUsuario
     * @param titulo
     * @param idPublicacao
     */
    public PublicacaoListar(Integer idPublicacao, String titulo, String ingredientes, String modoPreparo, Integer idUsuario, String foto) {
        super();
        this.idPublicacao = idPublicacao;
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.modoPreparo = modoPreparo;
        this.idUsuario = idUsuario;
        this.foto = foto;
    }

    @JsonProperty("idPublicacao")
    public Integer getIdPublicacao() {
        return idPublicacao;
    }

    @JsonProperty("idPublicacao")
    public void setIdPublicacao(Integer idPublicacao) {
        this.idPublicacao = idPublicacao;
    }

    @JsonProperty("titulo")
    public String getTitulo() {
        return titulo;
    }

    @JsonProperty("titulo")
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @JsonProperty("ingredientes")
    public String getIngredientes() {
        return ingredientes;
    }

    @JsonProperty("ingredientes")
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    @JsonProperty("modoPreparo")
    public String getModoPreparo() {
        return modoPreparo;
    }

    @JsonProperty("modoPreparo")
    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    @JsonProperty("idUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    @JsonProperty("idUsuario")
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @JsonProperty("foto")
    public String getFoto() {
        return foto;
    }

    @JsonProperty("foto")
    public void setFoto(String foto) {
        this.foto = foto;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
