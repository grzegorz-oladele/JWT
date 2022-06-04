package pl.grzegorz.JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.grzegorz.JWT.model.Motorcycle;

@Repository
public interface MotorcycleRepository extends JpaRepository<Motorcycle, Long> {
}
