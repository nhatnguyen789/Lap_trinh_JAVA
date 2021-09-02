import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class NhanVien {
    private String manv;
    private String ten;
    private int tuoi;
    private float luong;

    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma nv : ");
        this.manv = sc.nextLine();
        System.out.print("nhap ten : ");
        this.ten = sc.nextLine();
        System.out.print("nhap tuoi : ");
        this.tuoi = sc.nextInt();
        System.out.print("nhap luong : ");
        this.luong = sc.nextFloat();
    }

    public String toString(){
        return "manv : " + this.manv + "\nten : " + this.ten + "\ntuoi : " + this.tuoi + "\nluong : " + this.luong + "\n";
    }
    public String toStringForFile(){
        String luongstr = String.valueOf(this.luong);
        return this.manv + " " + this.ten + " " + this.tuoi + " " + luongstr.substring(0,luongstr.length()-2);
    }
    public NhanVien() {
    }

    public NhanVien(String manv, String ten, int tuoi, float luong) {
        this.manv = manv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.luong = luong;
    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
}