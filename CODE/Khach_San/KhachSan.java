package bt5;

import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private List<Nguoi> nguoi;

    public KhachSan() {
        nguoi = new ArrayList<>();
    }

    public void add(Nguoi nguoi1) {
        this.nguoi.add(nguoi1);
    }

    public boolean delete(String cmnd) {
        Nguoi nguoi1 = this.nguoi.stream().filter(p -> p.getCmnd().equals(cmnd)).findFirst().orElse(null);
        if (nguoi1 == null) {
            return false;
        } else {
            this.nguoi.remove(nguoi1);
            return true;
        }

    }

    public int calculator(String cmnd) {
        Nguoi nguoi1 = this.nguoi.stream().filter(p -> p.getCmnd().equals(cmnd)).findFirst().orElse(null);
        if (nguoi1 == null) {
            return 0;
        }
        return nguoi1.getRoom().getGia() * nguoi1.getSoNgayThue();
    }

    public void show() {
        this.nguoi.forEach(p -> System.out.println(p.toString()));

    }
}
