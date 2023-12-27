package com.thinkitive.abstraction.entity;

import java.util.Scanner;

public class Circle extends Shape {
    private final double pi = 3.14;

    public Circle() {
    }

    @Override
    public void calculateArea() {
        System.out.println("Enter Radius of Circle to Calculate Area");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println(" Circle : " + "\n" +
                " Name : " + "Circle" + "\n" +
                " Radius : " + radius + "\n" +
                " Area : " + (double) (pi * (radius * 2))
        );
    }

    @Override
    public void displayInfo() {

    }
}
