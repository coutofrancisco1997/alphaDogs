package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    public String showUser(@PathVariable Integer id, Model model) {
        User user = userService.get(id);
        model.addAttribute("user", user);
        return "user/show";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/signup")
    public String signUpUser(Model model) {
        model.addAttribute("user", new User());
        return "user/sign-up-edit";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action=save")
    public String saveCustomer(@Valid @ModelAttribute("user") User user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            return "user/sign-up-edit";
        }

        User savedCustomer = user;
        redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedCustomer.getName());
        return "redirect:/user/" + savedCustomer.getId();
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/", ""}, params = "action=cancel")
    public String cancelSaveCustomer() {
        return "redirect:/home";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/addPacket")
    public String addPacote(Model model){
        return "";
    }
}
