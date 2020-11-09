package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario obterUsuario(int idUsuario){

        Optional usuario = usuarioRepository.findById(idUsuario);
        if(usuario.isPresent()){ return (Usuario) usuario.get(); }else{ return null; }
    }

    public Usuario fazLogin(String username, String senha){
        return usuarioRepository.fazLogin(username,senha);
    }

    public void cadastrarUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void salvar(Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
