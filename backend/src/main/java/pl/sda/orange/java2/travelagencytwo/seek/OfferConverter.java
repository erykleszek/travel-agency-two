package pl.sda.orange.java2.travelagencytwo.seek;

import org.springframework.stereotype.Component;
import pl.sda.orange.java2.travelagencytwo.entities.Offer;

@Component
public class OfferConverter {

    public OfferDTO map(Offer entity) {
        var dto = new OfferDTO();
        dto.setId(entity.getId());
        dto.setDepartureCity(entity.getDepartureCity());
        dto.setDestinationCity(entity.getDestinationCity());
        dto.setDepartureDate(entity.getDepartureDate());
        dto.setReturnDate(entity.getReturnDate());
        dto.setType(entity.getType());
        dto.setHotelStandard(entity.getHotelStandard());
        return dto;
    }


}
