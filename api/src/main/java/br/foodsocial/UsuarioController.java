package br.foodsocial;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public Usuario fazLogin(@RequestBody FormularioLogin formularioLogin){
        String username,senha;
        username = formularioLogin.getUsername();
        senha = formularioLogin.getSenha();

        return service.fazLogin(username,senha) ;
    }


    @PostMapping("/usuario")
    public void cadastrarUsuario(@RequestBody Usuario usuario ){
        service.cadastrarUsuario(usuario);
    }



    // atualizar
    @PutMapping("/usuario/{id}")
    public ResponseEntity<?> atualizarUsuario(@RequestBody Usuario usuario, @PathVariable Integer id){

        Usuario existente = service.obterUsuario(id);


        if(existente != null)
        {
            service.salvar(usuario);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

    }
}
