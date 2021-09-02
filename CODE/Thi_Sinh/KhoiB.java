package bt3;

public class KhoiB extends ThiSinh{
    public static final String Mon_Toan = "toan";
    public static final String Mon_Hoa = "hoa";
    public static final String Mon_Sinh = "sinh";
    public KhoiB(String soBaoDanh, String hoTen, String diaChi, String mucUuTien)
    {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }


    @Override
    public String toString() {
        return "KhoiB{" +
                ", soBaoDanh=" + soBaoDanh +
                ", hoTen='" + hoTen + '\'' +
                ", diaCHi='" + diaCHi + '\'' +
                ", mucUuTien='" + mucUuTien + '\'' +
                "Subject: " + Mon_Toan + " - " + Mon_Hoa + " - " + Mon_Sinh +
                '}';
    }
}
