package phattuan3;

public class NhanVienThuViec extends NhanVien{

	public NhanVienThuViec(String hoTen, int maso, double luong) {
		super(hoTen, maso, luong);
		// TODO Auto-generated constructor stub
	}
@Override
public double getThuNhap() {
	// TODO Auto-generated method stub
	return super.getThuNhap()*0.7;
}
}
