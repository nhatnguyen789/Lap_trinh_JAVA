package bt4;
import java.util.ArrayList;
import java.util.List;

public class KhuPho {
    List<HoGiaDinh> giaDinh;

    public KhuPho()
    {
        this.giaDinh = new ArrayList<>();
    }

    public List<HoGiaDinh> getGiaDinh()
    {
        return giaDinh;
    }

    public void setGiaDinh(List<HoGiaDinh> giaDinh)
    {
        this.giaDinh = giaDinh;
    }

    public void addGiaDinh(HoGiaDinh giadinh)
    {
        this.giaDinh.add(giadinh);
    }
}
