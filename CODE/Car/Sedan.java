import Car.Car;

public class Sedan extends Car { //class sedan kế thừa class car
    int length;      //trường của class
    @Override //Nếu lớp con có cùng phương thức như đã được khai báo trong lớp cha, thì đó gọi là Ghi đè phương thức
    protected double getSalePrice() { //ở đây phương thức getSalePrice đã được khai báo ở lớp cha(Car)
        if                           //mà chúng ta sử dụng lại nên cần phải @Override nó !!!
        (this.length > 20)
            return this.regularPrice * 0.95;
        else
            return this.regularPrice * 0.9;
    }
    public Sedan (int length)
    {
        super(280,25000,"yellow"); //sub class(lớp con) sẽ kế thừa các phương thức có sẵn
        this.length = length;  // của super class(lớp cha).
    }
    public void printSedan() {
        System.out.println("________________");
        System.out.println("Info of Sedan");
        this.printCar();
        System.out.println("Length: " + this.length);
    }
}