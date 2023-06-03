package pl.sda.orange.java2.travelagencytwo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "user")
public class User {

    @Id
    @GeneratedValue
    private long id;
    String firstName;
    String lastName;
    String userName;

}
