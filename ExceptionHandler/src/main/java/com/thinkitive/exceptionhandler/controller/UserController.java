package com.thinkitive.exceptionhandler.controller;

import com.thinkitive.exceptionhandler.service.UserCURD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserCURD userCURD;
}
