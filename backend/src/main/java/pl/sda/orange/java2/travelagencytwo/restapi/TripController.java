package pl.sda.orange.java2.travelagencytwo.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.sda.orange.java2.travelagencytwo.entities.Offer;
import pl.sda.orange.java2.travelagencytwo.service.OfferService;


import java.time.LocalDate;
import java.util.List;

@Controller
public class TripController {
    @Autowired
    private OfferService tripService;

    @GetMapping("/trips/search")
    public String searchTrips(@RequestParam("departureCity") String departureCity,
                              @RequestParam("destinationCity") String destinationCity,
                              @RequestParam("departureDateStart") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate departureDateStart,
                              @RequestParam("departureDateEnd") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate departureDateEnd,
                              @RequestParam("returnDateStart") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate returnDateStart,
                              @RequestParam("returnDateEnd") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate returnDateEnd,
                              @RequestParam("type") String type, @RequestParam("hotelStandard") String hotelStandard,
                              Model model) {
        List<Offer> trips = tripService.searchTrips(departureCity, destinationCity, departureDateStart, departureDateEnd,
                returnDateStart, returnDateEnd, type, hotelStandard);
        model.addAttribute("trips", trips);
        return "tripResults";
    }}