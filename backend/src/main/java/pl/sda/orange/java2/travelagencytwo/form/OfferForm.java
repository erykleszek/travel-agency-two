package pl.sda.orange.java2.travelagencytwo.form;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
@SpringBootApplication
@RequestMapping(path = "/offer_form")
public class OfferForm {

    public static void main(String[] args) {
        SpringApplication.run(OfferForm.class, args);
    }

        @PostMapping("/save")
        public ModelAndView saveForm (@RequestParam("name") String namee,
                                      @RequestParam("typeOffer") String typeOffer,
                                      @RequestParam("description") String description,
                                      @RequestParam("startDate") LocalDate startDate,
                                      @RequestParam("endDate") LocalDate endDate,
                                      @RequestParam("hotel") String hotel,
                                      @RequestParam("airport") String airport,
                                      @RequestParam("board") String board,
                                      @RequestParam("address") String address,
                                      @RequestParam("facultative_trips") String facultative_trips) {

            ModelAndView modelAndView = new ModelAndView("success");
            modelAndView.addObject("message", "Wycieczka zapisana pomyślnie");
            return modelAndView;
        }




    }