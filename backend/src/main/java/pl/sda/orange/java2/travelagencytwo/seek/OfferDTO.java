package pl.sda.orange.java2.travelagencytwo.seek;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Data

public class OfferDTO {

    private Long id;

    private String departureCity;

    private String destinationCity;

    private LocalDate departureDate;

    private LocalDate returnDate;

    private String type;

    private String hotelStandard;

}
