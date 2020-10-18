package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CategoriaController {
    @Autowired
    private CategoriaService service;

    @GetMapping("/categorias")
    public List<Categoria> obterCategorias(){
        return service.obterCategorias();
    }

}
