package tasknavigation.demo.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import tasknavigation.demo.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByEmailAndSenha(String email, String senha);
}
