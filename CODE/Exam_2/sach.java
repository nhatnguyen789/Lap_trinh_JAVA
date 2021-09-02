import java.util.Scanner;

public class sach {
    protected String Sach;
    protected String tacgia;
    protected int soluong;

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setSach(String sach) {
        Sach = sach;
    }

    public void setTacgia(String tacgia) {
        this.tacgia = tacgia;
    }

    public String getSach() {
        return Sach;
    }

    public int getSoluong() {
        return soluong;
    }

    public String getTacgia() {
        return tacgia;
    }
    public void Input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("sach : ");
        Sach = scanner.nextLine();
    }
    public sach() {};
    public sach(String sach,String tacgia,String soluong){};
}
