import Car.Car;

public class Ford extends Car {  //class Ford (sub class:lớp con) kế thừa class car(super class)
    int year;        //khai báo trường của class Ford
    int manufactureDiscount; //Khai báo trường của class Ford
    @Override
    protected double getSalePrice()
    {
        return this.regularPrice - this.manufactureDiscount;
    }
    public Ford (int year, int manufactureDiscount) //constructor
    {
        super(270,20000,"red"); //Có thể sử dụng từ khóa "super" để truy cập lại
        this.year = year;                     //lại phương thức đã được ghi đè của supper class(lớp cha).
        this.manufactureDiscount = manufactureDiscount;
    }
    public void printFord() //in thông tin xe Ford
    {
        System.out.println("________________");
        System.out.println("Info of Ford");
        this.printCar();
        System.out.println("Year: " + this.year);
        System.out.println("Manufacture discount: " + this.manufactureDiscount);
    }
}
//lưu ý:Overloading :là phương thức cùng tên nhưng khác tham số
// Overriding (@Override): là phương thức lớp con kế thừa viết lại
//Qui tắc cho ghi đè phương thức trong Java::
//1.Phương thức phải có cùng tên như trong lớp cha.
//2.Phương thức phải có cùng tham số như trong lớp cha.
//3.Phải là quan hệ IS-A (kế thừa).