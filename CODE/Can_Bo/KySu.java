package bt1;

public class KySu extends CanBo{
    private String nganh;

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public String getNganh()
    {
        return nganh;
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganh)
    {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.nganh = nganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", gioiTinh='" + gioiTinh + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", nganh='" + nganh + '\'' +
                '}';
    }
}
