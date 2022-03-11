package com.nology;

import org.w3c.dom.ls.LSOutput;

public class Circle extends Shape{

    public Circle(int numOfSides) {
        super(numOfSides);
    }

    @Override
    public void getArea() {
        double area = Math.PI * getNumOfSides() * getNumOfSides();
        System.out.println("The area of circle is " + area);
    }

    @Override
    public void getPerimeter() {
        double perimeter = 2 * Math.PI * getNumOfSides();
        System.out.println("The perimeter of circle is " + perimeter);
    }
}
