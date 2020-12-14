package org.academiadecodigo.hackaton.controllers;

import org.academiadecodigo.hackaton.commands.SignInDto;
import org.academiadecodigo.hackaton.commands.UserDto;
import org.academiadecodigo.hackaton.converter.UserDtoToUser;
import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.services.AuthService;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
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


    private UserDtoToUser signUpUserDtoToUser;

    @Autowired
    public void setAuthService(AuthService authService) {
        this.authService = authService;
    }

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }


    @Autowired
    public void setSignUpUserDtoToUser(UserDtoToUser signUpUserDtoToUser) {
        this.signUpUserDtoToUser = signUpUserDtoToUser;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/up")
    public String signUpUser(Model model) {
        UserDto signUpUserDto = new UserDto();
        model.addAttribute("user", signUpUserDto);
        return "user/sign-up-edit";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/in/auth"}, params = "action=save")
    public String signIn(@Valid @ModelAttribute("user") SignInDto userDto) {

        if(authService.authenticate(userDto.getEmail(), userDto.getPassword())){
            return "redirect:/home/main";
        }

        return "user/sign-in";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/in/auth"}, params = "action=cancel")
    public String cancelSignIn() {
        return "redirect:/home/home";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/in")
    public String showSignIn(Model model) {
        SignInDto signInUserDto = new SignInDto();
        model.addAttribute("user", signInUserDto);
        return "user/sign-in";
    }

    @RequestMapping(method = RequestMethod.POST, path = {"/up/save"}, params = "action=save")
    public String saveCustomer(@Valid @ModelAttribute("user") UserDto user, BindingResult bindingResult, RedirectAttributes redirectAttributes) {

        if(bindingResult.hasErrors()){
           return "user/sign-up-edit";
        }

        User savedUser = userService.add(signUpUserDtoToUser.convert(user));

        if(savedUser==null){
            user.setEmail("");
            return "user/sign-up-edit";
        }

        authService.setAccessingUser(savedUser);
        redirectAttributes.addFlashAttribute("lastAction", "Saved " + savedUser.getName() + " ID: " + savedUser.getId());
        return "redirect:/home/main";
    }


    @RequestMapping(method = RequestMethod.POST, path = {"/up/save"}, params = "action=cancel")
    public String cancelSaveCustomer() {
        return "redirect:/user/sign-up-edit";
    }



}
