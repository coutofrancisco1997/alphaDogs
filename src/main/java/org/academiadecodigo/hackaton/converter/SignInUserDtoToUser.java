package org.academiadecodigo.hackaton.converter;

import org.academiadecodigo.hackaton.commands.SignInUserDto;
import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignInUserDtoToUser {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User convert(SignInUserDto userDto) {

        User user = new User();

        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());

        return user;
    }
}
