package com.thinkitive.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeDriver {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("saurabh", 23454));
        list.add(new Employee("rakesh", 10000));
        list.add(new Employee("sachin", 30000));
        list.add(new Employee("aniket", 15000));
        list.add(new Employee("kishor", 14000));


        Predicate<Employee> predicate = employee -> employee.getSalary() > 14000;

        for (Employee employee : list) {
            if (predicate.test(employee))
                System.out.println(employee);
        }

    }
}
