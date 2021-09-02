package com.company;

public class Main {

    public static void main(String[] args) {
        Circle circle=new Circle();
        Rectangle rectangle=new Rectangle();
        Square square=new Square();

        circle.setColor("RED");
        circle.setFilled(true);
        circle.radius=30;

        rectangle.setColor("BLUE");
        rectangle.setFilled(true);
        rectangle.setLength(40);
        rectangle.setWidth(20);

        square.setColor("BLACK");
        square.setFilled(true);
        square.setSide(30);
       System.out.println("CIRCLE: " + circle.color + " - (Radius: " + circle.radius + "m)"+"\n"
                + "Area: " + Math.round(circle.getArea()) + "(m2)" + "\n"
                + "Perimeter: " + Math.round(circle.getPerimeter()) +"(m)"+ "\n");
        System.out.println("-----------------------------------");

          System.out.println("RECTANGLE: " + rectangle.color +" - (Length: " + rectangle.length +
                "m, Width: "+rectangle.width+"m"+")"+ "\n"
              + "Area: " + rectangle.getArea() + "(m2)" + "\n"
                + "Perimeter: " + rectangle.getPerimeter() +"(m)"+ "\n");
        System.out.println("-----------------------------------");

        System.out.println("SQUARE: " + square.color + " - (Side: " + square.side + "m)"+"\n"
                + "Area: " + square.getArea() + "(m2)" + "\n"
                + "Perimeter: " + square.getPerimeter() +"(m)"+ "\n");
        /*System.out.println("hinh tron:"+ circle.toString());
        System.out.println("hinh chu nhat:"+ rectangle.toString());
        System.out.println("hinh vuong:" +square.toString());*/
    }
}
