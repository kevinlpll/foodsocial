package br.foodsocial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query(nativeQuery = true,
            value = "SELECT " +
                    "   [ID_USUARIO], " +
                    "   [NOME], " +
                    "   [SOBRENOME], " +
                    "   [USERNAME]," +
                    "   [DESCRICAO_PERFIL] " +
                    "FROM [dbo].[USUARIO] A " +
                    "WHERE " +
                    "   [USERNAME] = ?1" +
                    "   AND [SENHA] = ?2 ")
    Usuario fazLogin(String username,String senha);
}
