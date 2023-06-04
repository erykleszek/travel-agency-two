package pl.sda.orange.java2.travelagencytwo;

import pl.sda.orange.java2.travelagencytwo.entities.Offer;

import java.util.ArrayList;
import  java.util.List;

public class OffersManagement {
    private final List<Offer> offer;

    public OffersManagement() {
        this.offer = new ArrayList<>();

    }

    public void addOffer (Offer offer) {
        offer.add(offer);
    }

    public void removeOffer(Offer offer) {
        offer.remove(offer);
    }

    public void modifyOffer(Offer previousOffer, Offer newOffer) {
        int index = offer.indexOf(previousOffer);
        if (index != -1) {
            offer.set(index, newOffer);
        }

    }
}
