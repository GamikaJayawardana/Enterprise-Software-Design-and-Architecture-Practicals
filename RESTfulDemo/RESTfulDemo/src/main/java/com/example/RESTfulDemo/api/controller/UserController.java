package com.example.RESTfulDemo.api.controller;
import com.example.RESTfulDemo.api.model.User;
import com.example.RESTfulDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class UserController {
    private UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("/user")
    public User getUser(@RequestParam Integer id) {
        User user=userService.getUser(id);
        return user;
    }
}
