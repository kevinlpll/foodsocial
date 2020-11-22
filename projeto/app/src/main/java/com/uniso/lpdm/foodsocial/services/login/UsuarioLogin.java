

package com.uniso.lpdm.foodsocial.services.login;

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
        "idUsuario",
        "primeiroNome",
        "sobrenome",
        "nomeUsuario",
        "descricaoPerfil"
})
public class UsuarioLogin {

    @JsonProperty("idUsuario")
    private Integer idUsuario;
    @JsonProperty("primeiroNome")
    private String primeiroNome;
    @JsonProperty("sobrenome")
    private String sobrenome;
    @JsonProperty("nomeUsuario")
    private String nomeUsuario;
    @JsonProperty("descricaoPerfil")
    private String descricaoPerfil;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     *
     */
    public UsuarioLogin() {
    }

    /**
     *
     * @param primeiroNome
     * @param nomeUsuario
     * @param descricaoPerfil
     * @param idUsuario
     * @param sobrenome
     */
    public UsuarioLogin(Integer idUsuario, String primeiroNome, String sobrenome, String nomeUsuario, String descricaoPerfil) {
        super();
        this.idUsuario = idUsuario;
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.nomeUsuario = nomeUsuario;
        this.descricaoPerfil = descricaoPerfil;
    }

    @JsonProperty("idUsuario")
    public Integer getIdUsuario() {
        return idUsuario;
    }

    @JsonProperty("idUsuario")
    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    @JsonProperty("primeiroNome")
    public String getPrimeiroNome() {
        return primeiroNome;
    }

    @JsonProperty("primeiroNome")
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    @JsonProperty("sobrenome")
    public String getSobrenome() {
        return sobrenome;
    }

    @JsonProperty("sobrenome")
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    @JsonProperty("nomeUsuario")
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    @JsonProperty("nomeUsuario")
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    @JsonProperty("descricaoPerfil")
    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    @JsonProperty("descricaoPerfil")
    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
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
