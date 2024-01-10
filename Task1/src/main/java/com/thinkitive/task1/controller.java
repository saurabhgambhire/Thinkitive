package com.thinkitive.task1;

import com.mashape.unirest.http.exceptions.UnirestException;
import com.thinkitive.task1.entity.EligibilityRequest;
import com.thinkitive.task1.service._270_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private _270_Service service;

        @PostMapping("/get")
    public String get270Format(@RequestBody EligibilityRequest eligibilityRequest){
        return service.get270Format(eligibilityRequest);
    }
}
