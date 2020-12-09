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
        return "redirect:/customer/list";
    }

    private void initializeData(){
        User user = new User();
        user.setName("Batata");
        user.setEmail("mail@gmail.com");
        user.setPhone("5345345363");
        userService.saveUserOnMap(user);

        Entertainment entertainment = new Restaurant();
        entertainment.setName("Alho");
        Entertainment entertainment1 = new Nature();
        entertainment1.setName("Em");
        Entertainment entertainment2 = new Culture();
        entertainment2.setName("Po");
        Entertainment entertainment3 = new Services();
        entertainment3.setName("E");
        Entertainment entertainment4 = new Crazy();
        entertainment4.setName("Desmais");

        entertainmentService.addOnMap(entertainment);
        entertainmentService.addOnMap(entertainment1);
        entertainmentService.addOnMap(entertainment2);
        entertainmentService.addOnMap(entertainment3);
        entertainmentService.addOnMap(entertainment4);
    }
}
