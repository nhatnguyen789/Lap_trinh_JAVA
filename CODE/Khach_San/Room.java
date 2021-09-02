package bt5;

public class Room {
    protected String mucLuc;
    protected int gia;

    public Room(String mucLuc, int gia)
    {
        this.mucLuc = mucLuc;
        this.gia = gia;
    }

    public void setMucLuc(String mucLuc)
    {
        this.mucLuc = mucLuc;
    }

    public void setGia(int gia)
    {
        this.gia = gia;
    }

    public String getMucLuc()
    {
        return mucLuc;
    }

    public int getGia()
    {
        return gia;
    }

}
