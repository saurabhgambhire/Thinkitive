package com.thinkitive.exceptionhandler.controller;

import com.thinkitive.exceptionhandler.entity.User;
import com.thinkitive.exceptionhandler.moduleResponse.StatusResponse;
import com.thinkitive.exceptionhandler.service.UserCURD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserCURD userCURD;


    @PostMapping("/save")
    public ResponseEntity<StatusResponse> saveUser(@RequestBody User user) {
        return userCURD.saveUser(user);
    }
}
