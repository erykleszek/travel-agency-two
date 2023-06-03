package pl.sda.orange.java2.travelagencytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.orange.java2.travelagencytwo.entities.User;

import java.util.Optional;
@Repository
@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository <User, Long> {
    Optional<User> findByEmail(String email);

}
