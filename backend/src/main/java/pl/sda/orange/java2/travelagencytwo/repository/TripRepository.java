package pl.sda.orange.java2.travelagencytwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sda.orange.java2.travelagencytwo.entities.Trip;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface TripRepository extends JpaRepository<Trip, Long> {
    List<Trip> findByDepartureCityAndDestinationCityAndDepartureDateBetweenAndReturnDateBetweenAndTypeAndHotelStandard(
            String departureCity, String destinationCity, LocalDate departureDateStart, LocalDate departureDateEnd,
            LocalDate returnDateStart, LocalDate returnDateEnd, String type, String hotelStandard);
}
