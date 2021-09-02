package bt2;
public class TaiLieu {
    protected String maTaiLieu;
    protected String nhaXuatBan;
    protected int soBanPhatHanh;

    public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh)
    {
        this.maTaiLieu = maTaiLieu;
        this.nhaXuatBan = nhaXuatBan;
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public void setMaTaiLieu(String maTaiLieu)
    {
        this.maTaiLieu = maTaiLieu;
    }

    public void setNhaXuatBan(String nhaXuatBan)
    {
        this.nhaXuatBan = nhaXuatBan;
    }

    public void setSoBanPhatHanh(int soBanPhatHanh)
    {
        this.soBanPhatHanh = soBanPhatHanh;
    }

    public String getMaTaiLieu()
    {
        return maTaiLieu;
    }

    public String getNhaXuatBan()
    {
        return nhaXuatBan;
    }

    public int getSoBanPhatHanh()
    {
        return soBanPhatHanh;
    }

    @Override
    public String toString() {
        return "TaiLieu{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                '}';
    }
}
