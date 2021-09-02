package bt1;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class OficerManage {
    private List<CanBo> CanBo;

    public OficerManage()
    {
        this.CanBo = new ArrayList<>();
    }
       //thêm mới cán bộ
    public void addCanBo(CanBo canbo)
    {
        this.CanBo.add(canbo);
    }
      //Tìm kiếm theo họ tên
    public List<CanBo> TimCanBo(String hoTen)
    {
        return this.CanBo.stream().filter(canBo -> canBo.getHoTen().contains(hoTen)).collect(Collectors.toList());
    }
       //Hiển thị thông tin danh sách các cán bộ
    public void showInforCanBo()
    {
        this.CanBo.forEach(canBo -> System.out.println(canBo.toString()));
    }
}
