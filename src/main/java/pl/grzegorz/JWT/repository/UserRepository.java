package pl.grzegorz.JWT.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.grzegorz.JWT.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByName(String name);
}
