package com.example.RESTfulDemo.service;

import com.example.RESTfulDemo.api.model.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class UserService {
    private List<User> userList;
    public UserService() {
        userList = new ArrayList<>();
        User user1= new User(1,"Nimal",23,"Nimal@gmail.com");
        User user2= new User(2,"Bimal",22,"Bimal@gmail.com");
        User user3= new User(3,"Kamal",21,"Kamal@gmail.com");
        userList.addAll(Arrays.asList(user1,user2,user3));
    }
    public User getUser(Integer id) {
        for(User user:userList){
            if (id==user.getId()){
                return user;
            }
        }
        return null;
    }
}