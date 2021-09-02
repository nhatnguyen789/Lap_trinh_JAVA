package Review;
import java.util.Scanner;
interface Resizable
{
    abstract double resize(int percent);
}
public class ResizableCircle extends Review.Circle implements Resizable {
    public ResizableCircle(double radius) {
    }
    public ResizableCircle() {
    }
    public double resize(int percent) {
        return (radius * percent);
    }
    public void TestResizableCircle() {
        System.out.println("ban kinh sau khi sua lai:"+resize(90/100));
    }
}

