package nassau.restaurant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nassau.restaurant.model.Motoboy;

public interface MotoboyRepository extends JpaRepository<Motoboy, Long> {
    
}
