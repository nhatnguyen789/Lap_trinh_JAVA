package bt2;
public class TapChi extends TaiLieu{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh)
    {
        super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh)
    {
        this.soPhatHanh = soPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh)
    {
        this.thangPhatHanh = thangPhatHanh;
    }

    public int getSoPhatHanh()
    {
        return soPhatHanh;
    }

    public int getThangPhatHanh()
    {
        return thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "maTaiLieu='" + maTaiLieu + '\'' +
                ", nhaXuatBan='" + nhaXuatBan + '\'' +
                ", soBanPhatHanh=" + soBanPhatHanh +
                ", soPhatHanh=" + soPhatHanh +
                ", thangPhatHanh=" + thangPhatHanh +
                '}';
    }
}
