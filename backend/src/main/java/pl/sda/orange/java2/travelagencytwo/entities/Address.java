package pl.sda.orange.java2.travelagencytwo.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
//@AllArgsConstructor
@Table(name= "adresses")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    @Transient
    String number;
    String postalCode;
    String city;
    String country;
    String continent;

    public Address(Long id, String name, String number, String postalCode, String city, String country, String continent) {
        this.name = name;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
        this.continent = continent;
    }
}
