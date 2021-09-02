package bt4;
import java.util.List;

public class HoGiaDinh {
    private List<Nguoi> nguoi;
    private String diaChi;

    public HoGiaDinh(List<Nguoi> nguoi, String diaChi)
    {
        this.nguoi = nguoi;
        this.diaChi = diaChi;
    }
    public List<Nguoi> getNguoi()
    {
        return nguoi;
    }

    public void setNguoi(List<Nguoi> nguoi)
    {
        this.nguoi = nguoi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "HoGiaDinh{" +
                "nguoi=" + nguoi +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
