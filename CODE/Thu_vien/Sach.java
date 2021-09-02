package bt2;
public class Sach extends TaiLieu{
    private String tenTacGia;
    private int soTrang;

    public Sach(String maTaiLieu, String nhaXuatban, int soBanPhatHanh, String tenTacGia, int soTrang)
    {
        super(maTaiLieu, nhaXuatban, soBanPhatHanh);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public void setTenTacGia(String tenTacGia)
    {
        this.tenTacGia = tenTacGia;
    }

    public void setSoTrang(int soTrang)
    {
        this.soTrang = soTrang;
    }

    public String getTenTacGia()
    {
        return tenTacGia;
    }

    public int getSoTrang()
    {
        return soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tenTacGia='" + tenTacGia + '\'' +
                ", soTrang=" + soTrang +
                ", maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
