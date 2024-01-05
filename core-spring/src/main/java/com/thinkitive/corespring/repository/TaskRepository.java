package com.thinkitive.corespring.repository;

import com.thinkitive.corespring.entity.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<Task, Integer> {
}
