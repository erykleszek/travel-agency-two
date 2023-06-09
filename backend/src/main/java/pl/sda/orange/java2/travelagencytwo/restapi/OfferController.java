package pl.sda.orange.java2.travelagencytwo.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.orange.java2.travelagencytwo.entities.Offer;
import pl.sda.orange.java2.travelagencytwo.service.OfferService;

import java.util.List;

@RestController
@RequestMapping(path = "offer")
public class OfferController {

    private final OfferService offerService;
@Autowired
    public OfferController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping
    public List<Offer> getOffer() {
        return offerService.getOffer();
    }

}
