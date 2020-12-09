package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;


}
