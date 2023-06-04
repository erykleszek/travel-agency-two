package pl.sda.orange.java2.travelagencytwo.entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Data
@Entity
@Table(name = "trips")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "departure_city")
    private String departureCity;

    @Column(name = "destination_city")
    private String destinationCity;

    @Column(name = "departure_date")
    private LocalDate departureDate;

    @Column(name = "return_date" )
    private LocalDate returnDate;

    @Column(name = "type")
    private String type;

    @Column(name = "hotel_standard")
    private String hotelStandard;

    public Trip(String departureCity, String destinationCity, LocalDate departureDate, LocalDate returnDate, String type, String hotelStandard) {
        this.departureCity = departureCity;
        this.destinationCity = destinationCity;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.type = type;
        this.hotelStandard = hotelStandard;
    }

    public Trip() {
        //dla hibernate
    }
}
