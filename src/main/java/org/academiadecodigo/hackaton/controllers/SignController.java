package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.services.AuthService;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/sign")
public class SignController {

    private AuthService authService;
    private UserService userService;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/up")
    public String signUpUser(Model model) {
        model.addAttribute("user", new User());
        return "user/sign-up-edit";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/in/confirmation")
    public String signIn(@Valid @ModelAttribute("user") User user, Model model) {

        if(!authService.authenticate(user.getId(), user.getPassword())){
            return "";
        }

        return "redirect:/home/main";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/in")
    public String showSignIn(Model model) {
        model.addAttribute("user", new User());
        return "user/sign-in";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/up/save"}, params = "action=save")
    public String saveCustomer(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "user/sign-up-edit";
        }

        redirectAttributes.addFlashAttribute("lastAction", "Saved " + user.getName());
        return "redirect:/home";
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/up/cancel"}, params = "action=cancel")
    public String cancelSaveCustomer() {
        return "redirect:/user/sign-up-edit";
    }



}
