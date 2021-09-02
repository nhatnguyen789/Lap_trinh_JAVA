package bt3;

import java.util.List;
import java.util.ArrayList;

public class QuanLyThiSinh {
    List<ThiSinh> thisinh;
    public QuanLyThiSinh()
    {
        this.thisinh = new ArrayList<>();
    }

    public void add(ThiSinh thisinh)
    {
        this.thisinh.add(thisinh);
    }
    public void showInfor()
    {
        this.thisinh.forEach(thisinh -> System.out.println(thisinh.toString()));
    }

    public ThiSinh searchById(String soBaoDanh)
    {
        return this.thisinh.stream().filter(thisinh -> thisinh.getSoBaoDanh().equals(soBaoDanh)).findFirst().orElse(null);
    }

}
