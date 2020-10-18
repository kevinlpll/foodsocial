package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> obterCategorias(){
        return categoriaRepository.findAll(Sort.by(Sort.Direction.ASC,"descricao"));
    }
}