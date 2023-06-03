package pl.sda.orange.java2.travelagencytwo.repository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import pl.sda.orange.java2.travelagencytwo.entities.Address;

import java.util.Set;

import java.util.stream.Collectors;

@RequiredArgsConstructor
@Repository
public class AddressRepository {
    IAdressRepository adressRepository;
    public void setAdressRepository(Address adress){
        adressRepository.save(adress);
    }

    public Set<Address> getAllAdresses(){
        return adressRepository.findAll()
                .stream()
                .collect(Collectors.toSet());
    }

    public void addAddress(Address address) {
    }
}
