package pl.sda.orange.java2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.orange.java2.entities.Offers;

@Repository
public interface OffersRepository extends JpaRepository<Offers,Long> {
}
