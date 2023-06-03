package pl.sda.orange.java2.travelagencytwo.restapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import pl.sda.orange.java2.travelagencytwo.repository.AddressRepository;
import pl.sda.orange.java2.travelagencytwo.entities.Address;


import java.util.Set;
@RestController
@RequestMapping(path = "/api")
@RequiredArgsConstructor
public class AddressRestController {

    private final AddressRepository addressRepository;

    @GetMapping(path = "/addresses")
    public Set<Address> getAllAddresses(){
        return addressRepository.getAllAdresses();
    }

    @PostMapping (path= "/addresses")
    public void addAddress(@RequestBody Address address){
        addressRepository.addAddress(address);
    }


}