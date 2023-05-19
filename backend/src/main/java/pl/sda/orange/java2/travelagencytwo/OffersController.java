package pl.sda.orange.java2.travelagencytwo;

import pl.sda.orange.java2.travelagencytwo.repositories.OffersRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.orange.java2.travelagencytwo.entities.Offers;

import java.util.List;

@RequestMapping("/offers")
@RestController
public class OffersController {
    private OffersRepository offersRepository;
    public OffersController(OffersRepository offersRepository){
        this.offersRepository=offersRepository;
    }
    public List<Offers> findAll(){
        return offersRepository.findAll();
    }
}
