package pl.sda.orange.java2.travelagencytwo.entities;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
public enum TypesOfOffer {
    ALL_INCLUSIVE,
    PACKAGE_HOLIDAYS,
    TOUR,
    EXCURSION,
    CRUISE
}
