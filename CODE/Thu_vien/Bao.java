package bt2;
public class Bao extends TaiLieu{
    private int ngayPhatHanh;

    public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int ngayPhatHanh)
    {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public void setNgayPhatHanh(int ngayPhatHanh)
    {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getNgayPhatHanh()
    {
        return ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayPhatHanh=" + ngayPhatHanh +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
