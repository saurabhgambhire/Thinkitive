package com.thinkitive.StreamApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1, "saurabh", 22, "Katraj", "9359691331"));
        students.add(new Student(2, "rakesh", 23, "pune", "9874563215"));
        students.add(new Student(3, "Sachin", 24, "Ichalkaranji", "8741236956"));
        students.add(new Student(4, "pariskit", 25, "Hinjewadi", "9359691331"));
        students.add(new Student(5, "Aniket", 22, "pune", "9359691331"));
        students.add(new Student(6, "karan", 23, "mumbai", "9359691331"));
        students.add(new Student(7, "vishal", 22, "pune", "9359691331"));

        List<Student> collect = students.stream().filter(student -> student.getAge() >= 22 && student.getAge() < 25).collect(Collectors.toList());
//        System.out.println(collect);

        List<Student> pune = students.stream().filter(student -> student.getCity().equals("pune"))
                .sorted(Comparator.comparing(Student::getName, Comparator.reverseOrder()))  // Comparator.reverseOrder() - for reverse Order
                .collect(Collectors.toList());
        System.out.println(pune);

    }
}
