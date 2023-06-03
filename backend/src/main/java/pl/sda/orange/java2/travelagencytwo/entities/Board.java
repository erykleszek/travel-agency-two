package pl.sda.orange.java2.travelagencytwo.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name= "board")
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    private enum Type {
        BED_AND_BREAKFAST,
        HALF_BORD,
        ALL_INCLUSIVE,
        OVERNIGHT,
        SELF_CATERING,
        PROGRAM_PACKAGE,
        MEALS_PROPER_TO_HOTEL_PROGRAM_OR_EVENT_DESCRIPTION
    }


    @OneToMany(cascade = CascadeType.ALL)
    List<Offers> offersList;
}
