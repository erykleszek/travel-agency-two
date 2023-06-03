package pl.sda.orange.java2.travelagencytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.sda.orange.java2.travelagencytwo.entities.Address;

import java.util.Arrays;

public interface IAdressRepository extends JpaRepository<Address, Long> {
}
