package pl.sda.orange.java2.travelagencytwo.restapi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.orange.java2.travelagencytwo.registration.RegistrationRequest;
import pl.sda.orange.java2.travelagencytwo.service.RegistrationService;

@RestController
@RequestMapping(path = "/registration")
@AllArgsConstructor
public class RegistrationController {

    private RegistrationService registrationService;
    public String register(@RequestBody RegistrationRequest request){
        return registrationService.register(request);
    }

}
