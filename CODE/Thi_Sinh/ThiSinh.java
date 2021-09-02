package bt3;

public class ThiSinh {
    protected String soBaoDanh;
    protected String hoTen;
    protected String diaCHi;
    protected String mucUuTien;

    public ThiSinh(String soBaoDanh, String hoTen, String diaCHi, String mucUuTien)
    {
        this.soBaoDanh = soBaoDanh;
        this.hoTen = hoTen;
        this.diaCHi = diaCHi;
        this.mucUuTien = mucUuTien;
    }
    public void setSoBaoDanh(String soBaoDanh)
    {
        this.soBaoDanh = soBaoDanh;
    }
    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }
    public void setDiaCHi(String diaCHi)
    {
        this.diaCHi = diaCHi;
    }
    public void setMucUuTien(String mucUuTien)
    {
        this.mucUuTien = mucUuTien;
    }
    public String getSoBaoDanh()
    {
        return soBaoDanh;
    }
    public String getHoTen()
    {
        return hoTen;
    }
    public String getDiaCHi()
    {
        return diaCHi;
    }
    public String getMucUuTien()
    {
        return mucUuTien;
    }

}
