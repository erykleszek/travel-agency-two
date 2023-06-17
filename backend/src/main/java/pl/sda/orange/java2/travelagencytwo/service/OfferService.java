package pl.sda.orange.java2.travelagencytwo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.sda.orange.java2.travelagencytwo.entities.Offer;

import pl.sda.orange.java2.travelagencytwo.repository.OfferRepository;


import java.time.LocalDate;
import java.util.List;

@Service
public class OfferService {
    @Autowired
  
    private OfferRepository offerRepository;

    public List<Offer> searchTrips(String departureCity, String destinationCity, LocalDate departureDateStart,
                                   LocalDate departureDateEnd, LocalDate returnDateStart, LocalDate returnDateEnd, String type,
                                   String hotelStandard) {
        return offerRepository.findByDepartureCityAndDestinationCityAndDepartureDateBetweenAndReturnDateBetweenAndTypeAndHotelStandard(
                departureCity, destinationCity, departureDateStart, departureDateEnd, returnDateStart, returnDateEnd,
                type, hotelStandard);
    }

    public void addTrip(Offer trip) {
    }

    public void addOffer(Offer trip) {
    }

    public List<Offer> getOffer() {
        return null;
    }
}