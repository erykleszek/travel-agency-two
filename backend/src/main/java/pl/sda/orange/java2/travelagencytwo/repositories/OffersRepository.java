package pl.sda.orange.java2.travelagencytwo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.orange.java2.travelagencytwo.entities.Offers;

@Repository
public interface OffersRepository extends JpaRepository<Offers,Long> {
}
