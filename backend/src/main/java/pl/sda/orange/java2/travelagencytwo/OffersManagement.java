package pl.sda.orange.java2.travelagencytwo;

import pl.sda.orange.java2.travelagencytwo.entities.Offers;

import java.util.ArrayList;
import  java.util.List;

public class OffersManagement {
    private List<Offers> offers;

    public OffersManagement() {
        this.offers = new ArrayList<>();

    }

    public void addOffer (Offers offer) {
        offers.add(offer);
    }

    public void removeOffer(Offers offer) {
        offers.remove(offer);
    }

    public void modifyOffer(Offers previousOffer, Offers newOffer) {
        int index = offers.indexOf(previousOffer);
        if (index != -1) {
            offers.set(index, newOffer);
        }

    }
}
