package pl.sda.orange.java2.travelagencytwo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Offers {
    @Id
    @GeneratedValue
    private long id;

    private String country;

    private enum Type {
        ALLINCLUSIVE,
        CITYBREAK,
        FAMILYHOLIDAYS,
        CRUISE
    }
    private Date dates;
}
