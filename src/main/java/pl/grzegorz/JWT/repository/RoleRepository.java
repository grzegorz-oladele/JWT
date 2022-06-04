package pl.grzegorz.JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.grzegorz.JWT.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

    boolean existsByName(String name);

    Role findByName(String name);
}