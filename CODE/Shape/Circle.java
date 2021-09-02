package com.company;

public class Circle extends Shape {
    public double radius;   //radius:bán kính
    public Circle(){};
    public Circle(double radius){};
    public Circle(double radius,String color,Boolean filled){};
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    double getArea()
    {
        return (3.14*radius*radius);
    }
    @Override
    double getPerimeter() {
        return (2*3.14*radius);
    }
    @Override
    public String toString()
    {
        return "radius:" + radius + " " + "color:" + color + " " + "filled:"+filled;
    }
}
