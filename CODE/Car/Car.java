package Car;  //package dùng để chia interface và class thành từng gói khác nhau
public class Car {
    protected int speed;         //speed là trường của class
    protected double regularPrice; //regularPrice là trường của class
    protected String color;        //color là trường của class
    protected double getSalePrice()  //geter
    {
        return this.regularPrice;
    }
    public Car (int speed, int regularPrice, String color) //xây dựng constructor trùng với tên class
    {
        this.speed = speed; //this được đại diện cho một đối tượng hiện tại, được sử dụng trong lớp
        this.regularPrice = regularPrice;//để tham chiếu tới các thuộc tính và phương thức trong lớp
        this.color = color; //this dùng phân biệt thuộc tính các biến cục bộ hoặc tham số của phương thức
    }
    public void printCar() //Phương thức của class
    {
        System.out.println("Speed: " + this.speed);
        System.out.println("Regular price: " + this.regularPrice);
        System.out.println("Color: " + this.color);
    }
}