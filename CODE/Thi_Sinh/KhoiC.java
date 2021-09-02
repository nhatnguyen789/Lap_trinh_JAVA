package bt3;

public class KhoiC extends ThiSinh{
    public static final String Mon_Van = "van";
    public static final String Mon_Su = "su";
    public static final String Mon_Dia = "Dia";

    public KhoiC(String soBaoDanh,String hoTen, String diaChi, String mucUuTien)
    {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                ", soBaoDanh=" + soBaoDanh +
                ", hoTen='" + hoTen + '\'' +
                ", diaCHi='" + diaCHi + '\'' +
                ", mucUuTien='" + mucUuTien + '\'' +
                "Subject: " + Mon_Van + " - " + Mon_Su + " - " + Mon_Dia +
                '}';
    }
}
