package Nhat_1613133;
public class nguoi_thuong extends Nhat_1613133.con_nguoi {
    protected int tuoi;
    public nguoi_thuong(String ten,float HP,float speed,float damage,int tuoi)
    {
        super(ten, HP, speed, damage);
        this.tuoi=tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public int getTuoi() {
        return tuoi;
    }

    @Override
    public String toString() {
        return "nguoi_thuong{" +
                "ten='" + ten + '\'' +
                ", HP=" + HP +
                ", speed=" + speed +
                ", damage=" + damage +
                ", tuoi=" + tuoi +
                '}';
    }
    @Override
    public  float tongcacchiso()
    {
        return HP+speed+damage;
    }
}
