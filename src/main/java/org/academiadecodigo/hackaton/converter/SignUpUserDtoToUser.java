package org.academiadecodigo.hackaton.converter;


import org.academiadecodigo.hackaton.commands.SignUpUserDto;
import org.academiadecodigo.hackaton.persistence.model.User;
import org.academiadecodigo.hackaton.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpUserDtoToUser {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User convert(SignUpUserDto userDto) {

        User user = new User();

        user.setName(userDto.getName());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        user.setPhone(userDto.getPhone());

        return user;
    }
}
