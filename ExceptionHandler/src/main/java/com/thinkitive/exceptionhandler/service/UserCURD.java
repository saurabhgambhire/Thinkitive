package com.thinkitive.exceptionhandler.service;

import com.thinkitive.exceptionhandler.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCURD {

    @Autowired
    private UserRepository userRepository;
}
