package pl.sda.orange.java2.travelagencytwo.seek;

import org.springframework.stereotype.Component;

@Component
public class TripConverter {

    public TripDTO map(Trip entity) {
        var dto = new TripDTO();
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
