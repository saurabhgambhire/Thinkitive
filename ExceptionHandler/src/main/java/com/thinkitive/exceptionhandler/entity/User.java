package com.thinkitive.exceptionhandler.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "User_Data")
@Entity
public class User {
    @Id
    private int userId;
    private String name;
    private String email;
    private String mobile;
    private String gender;
    private int age;
    private String nationality;
}
