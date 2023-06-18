package pl.sda.orange.java2.travelagencytwo.entities;

import java.util.ArrayList;
import java.util.List;
public class TravelAgency {


        private final List<Offer> offerList;

        public TravelAgency() {
            offerList = new ArrayList<>();
        }

        public void addTravelPackage(Offer offer) {
            offerList.add(offer);
        }

        public void removeTravelPackage(Offer offer) {
            offer.remove(offer);
        }

        public List<Offer> getTravelPackages() {
            return offerList;
        }
    }
