package br.foodsocial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario obterUsuario(int idUsuario){
        return usuarioRepository.findById(idUsuario).get();
    }

    public Usuario fazLogin(String username, String senha){
        return usuarioRepository.fazLogin(username,senha);
    }

}
