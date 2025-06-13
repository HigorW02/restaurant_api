package nassau.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nassau.restaurant.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
