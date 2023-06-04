package pl.sda.orange.java2.travelagencytwo.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
@AllArgsConstructor
@Getter
@ToString
@Entity

public class Offer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String country;
    @Enumerated(EnumType.STRING)
    private TypesOfOffer typeOfOffer;
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;

    public Offer(String name, String country, String type, TypesOfOffer typeOfOffer, String description, LocalDate startDate, LocalDate endDate, Period numberOfDays) {
        this.name = name;
        this.country = country;
        this.typeOfOffer = typeOfOffer;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void add(Offer offer) {
    }

    public void remove(Offer offer) {
    }
}
