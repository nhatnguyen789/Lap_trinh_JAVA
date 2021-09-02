package phattuan3;

import java.util.ArrayList;

public class
Phattuan3 {
	public static void main(String[] args) {//cau 2
		int i,n,b;
		double a;
		String c;
		NhanVien NV1 = new NhanVien("Xuan Tung",001,1000);
		NhanVien NV2 = new NhanVien("Anh Nhat",002,1100);
		NhanVienThuViec NVT1 = new NhanVienThuViec("Duc Duy",004,1000);
		NhanVienThuViec NVT2 = new NhanVienThuViec("Co Hau",005,900);
		NhanVienChinhThuc NVC1 = new NhanVienChinhThuc("Le Van Thai",003,1100,100,1);
		NhanVienChinhThuc NVC2 = new NhanVienChinhThuc("Truc Quynh",006,1200,200,1);
		NhanVienChinhThuc NVC3 = new NhanVienChinhThuc("Vinh Nghi",007,1300,200,2);
		System.out.println("danh sach nhan vien la");
		System.out.println(NV1.toString());
		System.out.println(NV2.toString());
		System.out.println("danh sach nhan vien thu viec la");
		System.out.println(NVT1.getHoTen() + " " +NVT1.getMaso()+" " + NVT1.getThuNhap());
		System.out.println(NVT2.getHoTen() + " " +NVT2.getMaso() + " " + NVT2.getThuNhap());
		System.out.println("Danh sach nhan vien chinh thuc la");
		System.out.println(NVC1.getHoTen() + " " +NVC1.getMaso() + " " + NVC1.getThuNhap());
		System.out.println(NVC2.getHoTen() + " " +NVT2.getMaso() + " " + NVT2.getThuNhap());
		// cau 3
		ArrayList<NhanVienThuViec> NVTV = new ArrayList<>();
		NVTV.add(NVT1);
		NVTV.add(NVT2);
		ArrayList<NhanVienChinhThuc> NVCT = new ArrayList<>();
		NVCT.add(NVC1);
		NVCT.add(NVC2);
		NVCT.add(NVC3);
		// cau 4
		System.out.println("Danh sach chuoi Nhan Vien Thu Viec la");
		System.out.println(NVTV);
		System.out.println("danh sach chuoi nhan vien chinh thuc la");
		System.out.println(NVCT);
		//cau 5
		n=NVCT.size();
		a=NVCT.get(0).getThuNhap();
		c=NVCT.get(0).getHoTen();
		for (i=1;i<n;i++)
		{
			if (NVCT.get(i).getThuNhap()>=a)
			{
				a=NVCT.get(i).getThuNhap();
				c=NVCT.get(i).getHoTen();
			}
		}
		System.out.println("Luong cua nguoi cao nhat la");
		System.out.println(c);
	}
	

}
