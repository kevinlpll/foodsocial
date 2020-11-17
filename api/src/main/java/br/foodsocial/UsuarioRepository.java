package br.foodsocial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query(nativeQuery = true,
            value ="EXEC [dbo].[AUTENTICA_USUARIO] ?1, ?2"

    )
    Usuario fazLogin(String username,String senha);
}
