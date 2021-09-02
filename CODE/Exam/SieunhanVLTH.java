package Nhat_1613133;
public class SieunhanVLTH extends Nhat_1613133.con_nguoi {
    protected String magic;
    public SieunhanVLTH(String ten,float HP,float speed,float damage,String magic)
    {
        super(ten, HP, speed, damage);
        this.magic=magic;
    }
    public void setMagic(String magic) {
        this.magic = magic;
    }
    public String getMagic() {
        return magic;
    }

    @Override
    public String toString() {
        return "SieunhanVLTH{" +
                "magic='" + magic + '\'' +
                ", ten='" + ten + '\'' +
                ", HP=" + HP +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }
    public float tongcacchiso()
    {
        String fire = null,light=null,lucky=null;
        if(magic==fire)
        {
            return (HP+speed+damage)*2;
        }
        else if(magic==light)
        {
            return (HP+speed+damage)*3;
        }
        else if(magic==lucky)
        {
            return (HP+speed+damage)*4;
        }
        else
        {
            return (HP+speed+damage);
        }
    }
}
