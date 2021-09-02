package bt1;

import bt1.CanBo;

public class CongNhan extends CanBo {
    private int bac;
    public void setBac(int bac)
    {
        this.bac = bac;
    }
    public int getBac()
    {
        return bac;
    }
    public CongNhan(String hoten, int tuoi, String gioiTinh, String diaChi, int bac)
    {
        super(hoten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", bac=" + bac +
                '}';
    }
}
