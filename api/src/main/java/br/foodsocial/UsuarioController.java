package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService service;


    @GetMapping("/usuario/{idUsuario}")
    public Usuario obterUsuario(@PathVariable Integer idUsuario){
        return service.obterUsuario(idUsuario);
    }

    @PostMapping("/login")
    public boolean fazLogin(@RequestBody FormularioLogin formularioLogin){
        String username,senha;
        username = formularioLogin.getUsername();
        senha = formularioLogin.getSenha();

        return service.fazLogin(username,senha);
    }


}
