package com.thinkitive.spring3.service;

import com.thinkitive.spring3.entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentCURD {

    List<Student> students = new ArrayList<Student>();

    public Student saveStudent(Student student) {
        students.add(student);
        return student;
    }

    public List<Student> getStudentList() {
        return students;
    }

    public Optional<Student> getStudentWithId(String id) {
        return students.stream()
                .filter(student -> student.id().equals(id)).findFirst();
    }
}
