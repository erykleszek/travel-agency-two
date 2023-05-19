package pl.sda.orange.java2.travelagencytwo;

import org.springframework.beans.factory.annotation.Autowired;
import pl.sda.orange.java2.repositories.OffersRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.orange.java2.entities.Offers;

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
