package nassau.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nassau.restaurant.model.Produto;

public interface ProdutoRepository extends JpaRepository <Produto, Long> {
    
}
