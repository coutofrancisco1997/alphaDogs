package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.persistence.model.entertainment.*;
import org.academiadecodigo.hackaton.services.EntertainmentService;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private UserService userService;
    private EntertainmentService entertainmentService;

    @Autowired
    public void setEntertainmentService(EntertainmentService entertainmentService) {
        this.entertainmentService = entertainmentService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping
    public String home() {
        initializeData();
        return "redirect:/home";
    }

    private void initializeData(){
        User user = new User();
        user.setName("Batata");
        user.setEmail("mail@gmail.com");
        user.setPhone("5345345363");
        userService.add(user);

        Entertainment entertainment = new Restaurant();
        entertainment.setName("Alho");
        entertainment.setAvgPrice(10);
        entertainment.setEmail("@mail.com");
        entertainment.setPhone("952345");
        entertainment.setWorkingHours("10:00 - 22:00");

        Entertainment entertainment1 = new Nature();
        entertainment1.setName("Em");
        entertainment1.setAvgPrice(10);
        entertainment1.setEmail("@mail.com");
        entertainment1.setPhone("952345");
        entertainment1.setWorkingHours("10:00 - 22:00");

        Entertainment entertainment2 = new Culture();
        entertainment2.setName("Po");
        entertainment2.setAvgPrice(10);
        entertainment2.setEmail("@mail.com");
        entertainment2.setPhone("952345");
        entertainment2.setWorkingHours("10:00 - 22:00");

        Entertainment entertainment3 = new Services();
        entertainment3.setName("E");
        entertainment3.setAvgPrice(10);
        entertainment3.setEmail("@mail.com");
        entertainment3.setPhone("952345");
        entertainment3.setWorkingHours("10:00 - 22:00");

        Entertainment entertainment4 = new Crazy();
        entertainment4.setName("Demais");
        entertainment4.setAvgPrice(10);
        entertainment4.setEmail("@mail.com");
        entertainment4.setPhone("952345");
        entertainment4.setWorkingHours("10:00 - 22:00");

        entertainmentService.addOnMap(entertainment);
        entertainmentService.addOnMap(entertainment1);
        entertainmentService.addOnMap(entertainment2);
        entertainmentService.addOnMap(entertainment3);
        entertainmentService.addOnMap(entertainment4);
    }
}
