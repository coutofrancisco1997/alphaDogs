package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showCustomer(@PathVariable Integer id, Model model) {

        User user = userService.get(id);

        model.addAttribute("user", user);
        return "user/show";
    }
}
