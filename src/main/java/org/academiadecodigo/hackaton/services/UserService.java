package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.model.User;

import java.util.List;

public interface UserService {

    void saveUserOnMap(User user);

    User getUserOnMap(Integer id);

    List<User> getUserList();

    void deleteUserOnMap(Integer id);

}
