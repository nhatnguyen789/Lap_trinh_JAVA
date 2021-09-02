import Car.Car;

public class Truck extends Car { //lớp truck kế thừa lớp car từ khóa "extends"=kế thừa
    private int weight;   //trường của class truck
    @Override      //nếu lớp con cung cấp trình triển khai cụ thể của phương thức mà đã
    protected double getSalePrice() { //được cung cấp bởi một trong các lớp cha của nó, thì đó là ghi đè phương thức.
        if
        (weight > 2000)
            return this.regularPrice * 0.9; //giảm 10% suy ra giá mới  = giá cũ *90%
        else
            return this.regularPrice * 0.8; //giảm 20% suy ra giá mới =giá cũ *80%
    }
    public Truck (int weight) //constructor
    {
        super(260,11000,"blue"); //dùng để truy cập lại các trường của lớp cha, hoặc hàm tạo
        this.weight = weight;         // của lớp cha, và truy cấp các phương  thức của lớp cha
    }
    public void printTruck() {       //in thông tin xe Truck
        System.out.println("________________");
        System.out.println("Info of Truck");
        this.printCar();
        System.out.println("Weigth: " + this.weight);
    }
}