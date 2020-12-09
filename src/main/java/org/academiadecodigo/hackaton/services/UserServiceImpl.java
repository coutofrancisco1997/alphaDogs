package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.UserDao;
import org.academiadecodigo.hackaton.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class UserServiceImpl implements UserService{

    private UserDao userDao;
    private Map<Integer, User> userMap = new HashMap<>();

    @Autowired
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User get(Integer id) {
        return userDao.findById(id);
    }

    @Transactional
    @Override
    public User save(User user) {
        return userDao.saveOrUpdate(user);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        userDao.delete(id);
    }

    @Override
    public List<User> list() {
        return userDao.findAll();
    }

    @Override
    public void saveUserOnMap(Integer id, User user){

        if (user.getId() == null) {
            user.setId(getNextId());
        }

        userMap.put(user.getId(), user);
    }

    @Override
    public User getUserOnMap(Integer id){
        return userMap.get(id);
    }

    @Override
    public List<User> getUserList(){
        return new ArrayList<>(userMap.values());
    }

    private Integer getNextId() {
        return userMap.isEmpty() ? 1 : Collections.max(userMap.keySet()) + 1;
    }
}
