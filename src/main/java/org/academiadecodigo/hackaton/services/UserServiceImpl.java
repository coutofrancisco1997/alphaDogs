package org.academiadecodigo.hackaton.services;

import org.academiadecodigo.hackaton.persistence.dao.UserDao;
import org.academiadecodigo.hackaton.persistence.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
public class UserServiceImpl implements UserService{

    private Map<Integer, User> userMap = new HashMap<>();

    @Override
    public User add(User user){

        if (user.getId() == null) {
            user.setId(getNextId());
        }

        userMap.put(user.getId(), user);
        return get(user.getId());
    }

    @Override
    public User get(Integer id){
        return userMap.get(id);
    }

    @Override
    public List<User> list(){
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void delete(Integer id) {
        userMap.remove(id);
    }

    private Integer getNextId() {
        return userMap.isEmpty() ? 1 : Collections.max(userMap.keySet()) + 1;
    }
}
