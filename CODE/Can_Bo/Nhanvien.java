package bt1;

public class Nhanvien extends CanBo{
    private String congViec;

    public Nhanvien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec)
    {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public void setCongViec(String congViec)
    {
        this.congViec = congViec;
    }

    public String getCongViec()
    {
        return congViec;
    }

    @Override
    public String toString() {
        return "Nhanvien{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", congViec='" + congViec + '\'' +
                '}';
    }
}
