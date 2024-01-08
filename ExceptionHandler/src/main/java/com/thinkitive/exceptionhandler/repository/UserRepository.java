package com.thinkitive.exceptionhandler.repository;

import com.thinkitive.exceptionhandler.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
