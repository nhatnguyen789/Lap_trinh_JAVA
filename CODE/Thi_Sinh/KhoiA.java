package bt3;

public class KhoiA extends ThiSinh{
   public static final String Mon_Toan ="toan";
   public static final String Mon_Ly = "ly";
   public static final String Mon_Hoa = "hoa";
    public KhoiA(String soBaoDanh, String hoTen, String diaChi, String mucUuTien)
    {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }


    @Override
    public String toString() {
        return "KhoiA{" +
                ", soBaoDanh=" + soBaoDanh +
                ", hoTen='" + hoTen + '\'' +
                ", diaCHi='" + diaCHi + '\'' +
                ", mucUuTien='" + mucUuTien + '\'' +
                ", Subject: " + Mon_Toan + " - " + Mon_Ly + " - " + Mon_Hoa +
                '}';
    }
}
