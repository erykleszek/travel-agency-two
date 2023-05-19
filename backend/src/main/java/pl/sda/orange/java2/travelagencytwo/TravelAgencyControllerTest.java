package pl.sda.orange.java2.travelagencytwo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TravelAgencyControllerTest{
    @RequestMapping
    public String doesItWork(){
        return "Działam!!";
    }
}
