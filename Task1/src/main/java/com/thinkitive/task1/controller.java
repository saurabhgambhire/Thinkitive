package com.thinkitive.task1;

import com.thinkitive.task1.entity.EligibilityRequest;
import com.thinkitive.task1.service._270_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    private _270_Service service;

    //    @PostMapping("/get")
//    public String get270Format(@RequestBody EligibilityRequest eligibilityRequest){
//        return service.get270Format(eligibilityRequest);
//    }
    @PostMapping("/get")
    public String getNM1Format(@RequestBody EligibilityRequest eligibilityRequest) {
        return service.getNM1Format(eligibilityRequest);
    }


}
