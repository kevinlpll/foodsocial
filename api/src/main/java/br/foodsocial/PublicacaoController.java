package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublicacaoController {

    @Autowired
    private PublicacaoService service;

    @GetMapping("/publicacoes")
    public List<Publicacao> obterPublicacoes(){
        return service.obterPublicacoes();
    }
}

