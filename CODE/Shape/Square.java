package com.company;

import com.company.Rectangle;

class Square extends Rectangle {
    protected double side;
    public Square(){};
    public Square (double side){};
    public Square(double side,String color,boolean filled){};
    @Override
    public void setWidth(double width)
    {
        super.setWidth(width);
    }
    @Override
    public void setLength(double length)
    {
        super.setLength(length);
    }
    @Override
    public double getArea()
    {
        return side*side;
    }
    @Override
    public double getPerimeter()
    {
        return side*4;
    }
    public void setSide(double side)
    {
        this.side=side;
    }
    @Override
    public String toString()
    {
        return "side:"+ side + " " + "color:"+ color + " " + "filled:" + filled ;
    }
}
