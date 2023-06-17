package pl.sda.orange.java2.travelagencytwo.dataInitalizer;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pl.sda.orange.java2.travelagencytwo.entities.Offer;
import pl.sda.orange.java2.travelagencytwo.entities.Trip;
import pl.sda.orange.java2.travelagencytwo.service.OfferService;
import pl.sda.orange.java2.travelagencytwo.service.TripService;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
@Transactional
public class DataInitializer {

   private final OfferService offerService;
   private final TripService tripService;

   @EventListener(ApplicationReadyEvent.class)
   public void initData(){
// initOffers();
initTrips();

   }

    private void initTrips() {
       Trip trip = new Trip("Warszawa", "Alanya", LocalDate.of(2023,7,15), LocalDate.of(2023,7,23), "Summer Paradise", "*****");
       Trip trip2 = new Trip("Wrocław", "Madrit", LocalDate.of(2023,9,1), LocalDate.of(2023,8,15), "Hola Hola!", "****");
       Trip trip3 = new Trip("Kraków", "Hurghada", LocalDate.of(2023,9,1), LocalDate.of(2023, 9,23), "Kleopatra vibe", "****");
       Trip trip4 = new Trip("Radom", "Barcelona", LocalDate.of(2023,8,5), LocalDate.of(2023, 8,13), "Oliwki, sangria i churros", "**");
       Trip trip5 = new Trip("Kraków", "Słoneczny Brzeg", LocalDate.of(2023,9,1), LocalDate.of(2023, 9,23), "Chwila zapomnienia", "****");
       Trip trip6 = new Trip("Warszawa", "Ateny", LocalDate.of(2023,8,15), LocalDate.of(2023, 8,23), "Dotyk przeszłości", "****");
       Trip trip7 = new Trip("Wrocław", "Antalya", LocalDate.of(2023,7,7), LocalDate.of(2023, 7,18), "Luksus pod palmami", "*****");

   tripService.addTrip(trip);
   tripService.addTrip(trip2);
   tripService.addTrip(trip3);
   tripService.addTrip(trip4);
   tripService.addTrip(trip5);
   tripService.addTrip(trip6);
   tripService.addTrip(trip7);
   }

//    public void initOffers() {
//
//       Offer offer = new Offer("Merhaba!", "Turkiye", "All-inc", "2weeks", "Orient", 15.07, 23.07, 14 );
//       Offer offer2 = new Offer("Aloha", "Spain", "All-inc", "weekly", "have fun!", 01.07, 15.07, 14 );
//
//       offerService.addOffer(offer);
//       offerService.addOffer(offer2);
    }

}
