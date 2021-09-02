package bt4;

public class Nguoi {
    protected String hoTen;
    protected int tuoi;
    protected String ngheNghiep;
    protected int cmnd;

    public Nguoi(String hoTen, int tuoi, String ngheNghiep, int cmnd)
    {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.cmnd = cmnd;
    }


    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }
    public void setTuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    public void setNgheNghiep(String ngheNghiep)
    {
        this.ngheNghiep = ngheNghiep;
    }
    public void setCmnd(int cmnd)
    {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "hoTen='" + hoTen + '\'' +
                ", tuoi=" + tuoi +
                ", ngheNghiep='" + ngheNghiep + '\'' +
                ", cmnd=" + cmnd +
                '}';
    }
}
