package nassau.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nassau.restaurant.model.Pagamento;


public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{

}
