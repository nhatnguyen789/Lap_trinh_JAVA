package Review;
interface GeometricObject{
    abstract double getPerimeter();
    abstract double getArea();
}
class Circle implements GeometricObject {
    protected double radius= 1.0;
    public Circle (double radius){};

    public Circle() {
    }

    @Override
    public double getPerimeter()
    {
        return (2*3.14*radius);
    }
    @Override
    public double getArea()
    {
        return (3.14*radius*radius);
    }
    public void TestCircle()
    {
        System.out.println("chu vi cua hinh tron la:"+getPerimeter());
        System.out.println("dien tich cua hinh tron la:"+getArea());
    }
}
