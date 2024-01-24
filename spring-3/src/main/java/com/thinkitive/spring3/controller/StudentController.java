package com.thinkitive.spring3.controller;

import com.thinkitive.spring3.entity.Student;
import com.thinkitive.spring3.service.StudentCURD;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentCURD studentCURD;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
       return studentCURD.saveStudent(student);
    }

    @GetMapping("/list")
    public List<Student> getStudents(){
       return studentCURD.getStudentList();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentWithId(@PathVariable String id){
        return studentCURD.getStudentWithId(id);
    }


}
