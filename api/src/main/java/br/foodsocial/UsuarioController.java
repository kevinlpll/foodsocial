package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService service;


    @GetMapping("/usuarios")
    public List<Usuario> listaUsuarios(){ return service.listarTodos(); }
}
