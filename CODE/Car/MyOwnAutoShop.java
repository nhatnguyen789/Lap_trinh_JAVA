public class MyOwnAutoShop {
    static Sedan se = new Sedan(2);
    static Ford fo1 = new Ford(2019, 500);
    static Ford fo2 = new Ford(2019, 600);

    public static void main(String[] args) {
        se.printSedan();
        fo1.printFord();
        fo2.printFord();
    }
}
