//package pl.sda.orange.java2.travelagencytwo.form;
//
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.time.LocalDate;
//
//@Controller
//@RequestMapping(path = "/offer_form")
//public class OfferFormController {
//
//        @PostMapping("/save")
//        public ModelAndView saveForm (@RequestParam("name") String namee,
//                                      @RequestParam("typeOffer") String typeOffer,
//                                      @RequestParam("description") String description,
//                                      @RequestParam("startDate") LocalDate startDate,
//                                      @RequestParam("endDate") LocalDate endDate,
//                                      @RequestParam("hotel") String hotel,
//                                      @RequestParam("airport") String airport,
//                                      @RequestParam("board") String board,
//                                      @RequestParam("address") String address,
//                                      @RequestParam("facultative_trips") String facultative_trips) {
//
//            ModelAndView modelAndView = new ModelAndView("success");
//            modelAndView.addObject("message", "Wycieczka zapisana pomyślnie");
//            return modelAndView;
//        }
//
//    @GetMapping("/success")
//    public String success() {
//        return "success";
//    }
//
//
//
//
//    }