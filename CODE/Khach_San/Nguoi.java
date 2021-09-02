package bt5;

public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String cmnd;
    private Room room;
    private int soNgayThue;

    public Nguoi(String hoTen, int tuoi, String cmnd, Room room, int soNgayThue)
    {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.cmnd = cmnd;
        this.room =room;
        this.soNgayThue = soNgayThue;
    }

    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }

    public void setCmnd(String cmnd)
    {
        this.cmnd = cmnd;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public void setSoNgayThue(int soNgayThue)
    {
        this.soNgayThue = soNgayThue;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public int getTuoi()
    {
        return tuoi;
    }

    public String getCmnd()
    {
        return cmnd;
    }
    public Room getRoom()
    {
        return room;
    }
    public int getSoNgayThue()
    {
        return soNgayThue;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", cmnd=" + cmnd +
                ", room=" + room.toString() +
                '}';
    }
}
