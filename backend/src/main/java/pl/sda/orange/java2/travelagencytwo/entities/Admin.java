package pl.sda.orange.java2.travelagencytwo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Admin {

    @Id
    @GeneratedValue
    private long id;
    String firstName;
    String lastName;
    String userName;

}
