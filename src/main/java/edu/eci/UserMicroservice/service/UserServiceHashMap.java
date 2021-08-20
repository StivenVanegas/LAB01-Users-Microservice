/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.UserMicroservice.service;

import edu.eci.UserMicroservice.data.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author StivenVanegas
 */

@Service
public class UserServiceHashMap implements UserService{
    
    private final HashMap<String, User> users = new HashMap();

    @Override
    public User create(User user) {
        users.put(user.getId(), user);
        return user;
    }

    @Override
    public User findById(String id) {
        if(users.containsKey(id)){
            return users.get(id);
        }
        return null;
    }

    @Override
    public List<User> all() {
        List<User> usersList = new ArrayList();
        for(User u : users.values()){
            usersList.add(u);
        }
        return usersList;
    }
   
    @Override
    public Boolean deleteById(String id) {
        return users.remove(id, users.get(id));
    }

    @Override
    public User update(User user, String userId) {
        users.put(userId, user);
        return user;
    }
    
}
