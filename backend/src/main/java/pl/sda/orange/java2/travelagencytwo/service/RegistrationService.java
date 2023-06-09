package pl.sda.orange.java2.travelagencytwo.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sda.orange.java2.travelagencytwo.registration.EmailValidator;
import pl.sda.orange.java2.travelagencytwo.registration.RegistrationRequest;
import pl.sda.orange.java2.travelagencytwo.entities.User;
import pl.sda.orange.java2.travelagencytwo.entities.UserRole;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final UserService userService;
    private EmailValidator emailValidator;

    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if (!isValidEmail) {
            throw new IllegalStateException("email not valid");
        }
        return userService.signUpUser(
                new User(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        UserRole.USER
                )
        );
    }

}
