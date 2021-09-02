import java.util.Scanner;

public class NhanVien {
    private String MaNv;
    private String hoten;
    private int tuoi;
    private float luong;

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    public void setMaNv(String maNv) {
        MaNv = maNv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public float getLuong() {
        return luong;
    }

    public String getHoten() {
        return hoten;
    }

    public String getMaNv() {
        return MaNv;
    }
    public NhanVien(String MaNv,String hoten,int tuoi,float luong)
    {
        this.MaNv=MaNv;
        this.hoten=hoten;
        this.tuoi=tuoi;
        this.luong=luong;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "MaNv='" + MaNv + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi=" + tuoi +
                ", luong=" + luong +
                '}';
    }
    public String toStringForFile() {
        String luongstr = String.valueOf(this.luong);
        return this.MaNv + " " + this.hoten + " " + this.tuoi + " " + luongstr.substring(0, luongstr.length() - 2);
    }
}
