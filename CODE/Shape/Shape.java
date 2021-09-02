package com.company;

public abstract class Shape {   //abstract class là một class, chứa phương thức trừu tượng,
    protected String color;     //Các class khi kế thừa một abstract class sẽ phải định nghĩa
    protected boolean filled;  //lại các phương thức trừu tượng của abstract class,Một class chỉ có thể kế thừa 1 lớp trừu tượng
    public Shape(){};          //là 1 constructor cung cấp 1 cách tạo đối tượng
    public Shape(String color,boolean filled){} //là 1 constructor, giống tên class nhưng khác tham số
    public void setColor(String color) //phương thức set
    {
        this.color=color;
    }
    String getColor()
    {
        return color;
    } //phương thức get
    public void setFilled(boolean filled)
    {
        this.filled=filled;
    }
    boolean isFilled()
    {
        return this.filled;
    }
    abstract double getArea();   //abstract method chỉ định nghĩa tên cũng như tham số đầu vào
    abstract double getPerimeter();//abstract trống ko có thực thi
    public String toString(){
        return "color:"+color+" "+"filled:"+filled;
    }
}
//Có 2 loại method là abstract method và method thường:
//1.abstract method là method trống không có thực thi.
//2.method thường là method có thực thi.
//3.không thể khởi tạo đối tượng của abstract class
//4.Không hỗ trợ đa kế thừa.
//5.Phương thức abstract của abstract class không được phép khai báo nội dung phương thức.
// Nó chỉ có thể định nghĩa tên cũng như các tham số đầu vào.
//6.Mức truy cập các hàm của abstract phải ở public hoặc protected để lớp kế thừa có
// thể định nghĩa lại và các thuộc tính của lớp abstract không được khai báo abstract.
