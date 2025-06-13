package nassau.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nassau.restaurant.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
    
}
