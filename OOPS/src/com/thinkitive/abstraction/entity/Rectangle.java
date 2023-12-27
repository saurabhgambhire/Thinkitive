package com.thinkitive.abstraction.entity;

import java.util.Scanner;

public class Rectangle extends Shape {
    @Override
    public void calculateArea() {
        System.out.println("Enter Length and Width to Calculate Area");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        int length = sc.nextInt();
        System.out.println("Enter Width : ");
        int width = sc.nextInt();
        System.out.println(" Rectangle : " + "\n" +
                " Name : " + "Rectangle" + "\n" +
                " Length : " + length + "\n" +
                " Width : " + width + "\n" +
                " Area : " + (double) (length * width)
        );
    }

    @Override
    public void displayInfo() {

    }
}
