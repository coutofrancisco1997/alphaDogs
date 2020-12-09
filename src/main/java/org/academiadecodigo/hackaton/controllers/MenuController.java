package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.entertainment.EntertainmentType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class MenuController {

    @RequestMapping(method = RequestMethod.GET, path = {"/", ""})
    public String listRestaurant(Model model) {
        return "home";
    }

}
