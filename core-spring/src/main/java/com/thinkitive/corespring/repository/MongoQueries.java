package com.thinkitive.corespring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import com.thinkitive.corespring.entity.Task;

import lombok.val;

@Service
public class MongoQueries {

    @Autowired
    private MongoTemplate mongoTemplate;


    void getQueries(){
        Query query = new Query();
        query.addCriteria(Criteria.where("userid").is(query));
        mongoTemplate.find(query, Task.class);
        
    }
    
}
