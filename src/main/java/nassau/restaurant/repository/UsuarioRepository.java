package nassau.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nassau.restaurant.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
