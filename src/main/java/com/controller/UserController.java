package com.controller;


import com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.entity.User;
import java.util.List;


/**
 * Created by lenovo on 2017/7/21.
 */

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<User> findAll(){
        return userRepository.findAll();
    }
}

