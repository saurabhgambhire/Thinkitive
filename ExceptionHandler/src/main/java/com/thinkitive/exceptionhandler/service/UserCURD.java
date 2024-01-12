package com.thinkitive.exceptionhandler.service;

import com.thinkitive.exceptionhandler.entity.NullObjectException;
import com.thinkitive.exceptionhandler.entity.User;
import com.thinkitive.exceptionhandler.moduleResponse.StatusResponse;
import com.thinkitive.exceptionhandler.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserCURD {

    @Autowired
    private UserRepository userRepository;

    public ResponseEntity<StatusResponse> saveUser(User user) {
        
        if (user.getName() == null) {
            throw new NullObjectException(404, "Object Cannot be Null");
        }

        User save = userRepository.save(user);
        return new ResponseEntity<>(new StatusResponse(
                true,
                "User Saved Successfully",
                save
        ), HttpStatus.CREATED);
    }
}
