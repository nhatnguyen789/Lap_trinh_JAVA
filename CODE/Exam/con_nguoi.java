package Nhat_1613133;
public abstract class con_nguoi {
    protected String ten;
    protected float HP;
    protected float speed;
    protected float damage;

    public con_nguoi(String ten, float HP, float speed, float damage) {
    }

    public String getTen() {
        return ten;
    }

    public float getHP() {
        return HP;
    }

    public float getSpeed() {
        return speed;
    }

    public float getDamage() {
        return damage;
    }

    public void setDamage(float damage) {
        this.damage = damage;
    }

    public void setHP(float HP) {
        this.HP = HP;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "con_nguoi{" +
                "ten='" + ten + '\'' +
                ", HP=" + HP +
                ", speed=" + speed +
                ", damage=" + damage +
                '}';
    }
    public abstract float tongcacchiso();
}
