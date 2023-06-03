package pl.sda.orange.java2.travelagencytwo.service;

import org.springframework.stereotype.Service;
import pl.sda.orange.java2.travelagencytwo.entities.Offer;

import java.time.LocalDate;
import java.util.List;

import static pl.sda.orange.java2.travelagencytwo.entities.TypesOfOffer.TOUR;
@Service
public class OfferService {

public List<Offer> getOffer(){
        return List.of(
                new Offer(
                        1L,
                        "Blue sth",
                        "Malta",
                        TOUR,
                        "blah blah",
                        LocalDate.of(2023,10,01),
                        LocalDate.of(2023,10,9)
                )
        );
    }
}
