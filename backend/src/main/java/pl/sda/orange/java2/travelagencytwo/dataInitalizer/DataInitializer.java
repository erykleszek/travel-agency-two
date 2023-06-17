package pl.sda.orange.java2.travelagencytwo.dataInitalizer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
//import pl.sda.orange.java2.travelagencytwo.entities.Offer;

import pl.sda.orange.java2.travelagencytwo.service.OfferService;


import java.time.LocalDate;

@Component
@RequiredArgsConstructor
@Transactional
public class DataInitializer {

   private final OfferService offerService;
   private final OfferService tripService;

   @EventListener(ApplicationReadyEvent.class)
   public void initData(){
// initOffers();
initOffers();

   }

   private void initOffers() {
   }

//    private void initTrips() {
//       Offer trip = new Offer("Warsaw", "Alanya", LocalDate.of(2023,7,15), LocalDate.of(2023,7,23), "jakaś", "5gwiazdek");
//       Offer trip2 = new Offer("Wroclaw", "Madrit", LocalDate.of(2023,9,1), LocalDate.of(2023,8,15), "xx", "4*");
//       Offer trip3 = new Offer("Kraków", "Hurghada", LocalDate.of(2023,9,1), LocalDate.of(2023, 9,23), "xx", "4*");
//
//   tripService.addOffer(trip);
//   tripService.addOffer(trip2);
//   tripService.addOffer(trip3);
//   }

//    public void initOffers() {
//
//       Offer offer = new Offer("Merhaba!", "Turkiye", "All-inc", "2weeks", "Orient", 15.07, 23.07, 14 );
//       Offer offer2 = new Offer("Aloha", "Spain", "All-inc", "weekly", "have fun!", 01.07, 15.07, 14 );
//
//       offerService.addOffer(offer);
//       offerService.addOffer(offer2);
    }


