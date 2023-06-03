package pl.sda.orange.java2.travelagencytwo.entities;

import javax.persistence.*;

@Entity

@Table(name= "admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    String firstName;
    String lastName;
    String adminName;

}
