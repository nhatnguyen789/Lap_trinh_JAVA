package Review;

import Review.Circle;
import Review.GeometricObject;
import Review.Resizable;
import Review.ResizableCircle;

public class Main {
    public static void main(String[] args)
    {
        ResizableCircle ResizableCircle = new ResizableCircle();
        Circle circle = new Circle();
        System.out.println("kich thuoc ban kinh sau khi sua doi:"+ ResizableCircle.resize(90/100));
        System.out.println("chu vi cua hinh tron la:"+circle.getPerimeter());
        System.out.println("Dien tich cua hinh tron la:"+circle.getArea());
    }
}
