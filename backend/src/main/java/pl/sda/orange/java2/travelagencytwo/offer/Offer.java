package pl.sda.orange.java2.travelagencytwo.offer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.time.LocalDate;
import java.time.Period;
@AllArgsConstructor
@Getter
@ToString
public class Offer {
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
}
