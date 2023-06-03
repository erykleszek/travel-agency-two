package pl.sda.orange.java2.travelagencytwo.seek;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class TripService {
    @Autowired
    private TripRepository tripRepository;


    public List<Trip> searchTrips(String departureCity, String destinationCity, LocalDate departureDateStart,
                                  LocalDate departureDateEnd, LocalDate returnDateStart, LocalDate returnDateEnd, String type,
                                  String hotelStandard) {
        return tripRepository.findByDepartureCityAndDestinationCityAndDepartureDateBetweenAndReturnDateBetweenAndTypeAndHotelStandard(
                departureCity, destinationCity, departureDateStart, departureDateEnd, returnDateStart, returnDateEnd,
                type, hotelStandard);
    }}