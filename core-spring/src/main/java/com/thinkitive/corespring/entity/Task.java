package com.thinkitive.corespring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("Task")
public class Task {
    @Id
    private int id;
    private String title;
    private String description;
    private Date due_Date;
    private boolean status;
}
