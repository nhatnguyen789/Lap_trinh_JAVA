package phattuan3;

public class NhanVien {
private String hoTen;
private int maso;
protected double luong;
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public int getMaso() {
	return maso;
}
public void setMaso(int maso) {
	this.maso = maso;
}
public double getLuong() {
	return luong;
}
public void setLuong(double luong) {
	this.luong = luong;
}
public NhanVien(String hoTen, int maso, double luong) {
	super();
	this.hoTen = hoTen;
	this.maso = maso;
	this.luong = luong;
}
@Override
public String toString() {
	return "NhanVien [hoTen=" + hoTen + ", maso=" + maso + ", luong=" + luong + "]";
}
public double getThuNhap()
{
	return luong;
}
}


	