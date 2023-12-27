package com.thinkitive.encapsulation.service;

import com.thinkitive.encapsulation.entity.Employee;

import java.util.Scanner;

public class EmployeeDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = null;
        boolean status = true;
        do {
            System.out.println("Enter 1 to create Employee ");
            System.out.println(" Enter 2 to Get Employee Mobile Number ");
            System.out.println(" Enter 3 to Get Employee Password ");
            System.out.println(" ------------------------------- ");
            System.out.println(" Enter your Choice ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    System.out.println(" To Create Employee Please provide following details ");
                    System.out.println(" Enter your Employee Id ");
                    int emp_id = sc.nextInt();
                    System.out.println(" Enter your Name ");
                    String emp_name = sc.next();
                    System.out.println(" Enter your Mobile ");
                    String mobile = sc.next();
                    System.out.println(" Enter your Designation ");
                    String designation = sc.next();
                    System.out.println(" Enter your Password ");
                    String password = sc.next();

                    employee = new Employee(emp_id, emp_name, mobile, designation, password);

                    System.out.println(" Employee Created Successfully " + employee);
                    System.out.println(" ------------------------------ ");
                }
                break;

                case 2: {
                    System.out.println(" To Create Employee Please provide following details ");
                    System.out.println(" Enter your Employee Id ");
                    int emp_id = sc.nextInt();
                    System.out.println(" Enter your Password ");
                    String password = sc.next();

                    assert employee != null;
                    System.out.println(employee.getMobile(emp_id, password));

                    System.out.println(" ------------------------------ ");

                }
                break;

                case 3: {
                    System.out.println(" To Create Employee Please provide following details ");
                    System.out.println(" Enter your Employee Id ");
                    int emp_id = sc.nextInt();
                    System.out.println(" Enter your Password ");
                    String password = sc.next();

                    assert employee != null;
                    System.out.println(employee.getPassword(emp_id, password));

                }
                break;

                default: {
                    System.out.println("Please Enter Correct Choise ");
                }
            }
        } while (status);

    }
}
