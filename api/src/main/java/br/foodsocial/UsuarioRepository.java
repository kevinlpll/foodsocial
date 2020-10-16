package br.foodsocial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query(nativeQuery = true,
            value = "SELECT PWDCOMPARE(:senha,A.SENHA) FROM USUARIO A WHERE A.USERNAME = :username")
    Integer fazLogin(@Param("username") String username,@Param("senha") String senha);
}
