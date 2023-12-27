package com.thinkitive.abstraction.service;

import com.thinkitive.abstraction.entity.Circle;
import com.thinkitive.abstraction.entity.Rectangle;

public class ShapeDriver {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        circle.calculateArea();
        System.out.println(" ----------------------------------- ");
        rectangle.calculateArea();
    }
}
