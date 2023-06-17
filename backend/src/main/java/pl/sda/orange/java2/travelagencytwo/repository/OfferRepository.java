package pl.sda.orange.java2.travelagencytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.orange.java2.travelagencytwo.entities.Offer;


import java.time.LocalDate;
import java.util.List;

@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
    List<Offer> findByDepartureCityAndDestinationCityAndDepartureDateBetweenAndReturnDateBetweenAndTypeAndHotelStandard(
            String departureCity, String destinationCity, LocalDate departureDateStart, LocalDate departureDateEnd,
            LocalDate returnDateStart, LocalDate returnDateEnd, String type, String hotelStandard);
}
