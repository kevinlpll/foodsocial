package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicacaoService {
    @Autowired
    private PublicacaoRepository publicacaoRepository;

    public List<Publicacao> obterPublicacoes(){
        return publicacaoRepository.findAll(Sort.by(Sort.Direction.DESC,"idPublicacao"));
    }
}