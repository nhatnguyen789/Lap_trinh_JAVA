package phattuan3;

public class NhanVienChinhThuc extends NhanVien {
	double doanhSo;
	double hoaHong;
	public NhanVienChinhThuc(String hoTen, int maso, double luong,double doanhSo,double hoaHong) {
		super(hoTen, maso, luong);
		this.hoaHong=hoaHong;
		this.doanhSo=doanhSo;
		// TODO Auto-generated constructor stub
	}
@Override
public double getThuNhap() {
	// TODO Auto-generated method stub
	return super.getThuNhap()+doanhSo*hoaHong;
}
}
