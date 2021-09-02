package bt5;

public class RoomC extends  Room{
    public RoomC()
    {
        super("C", 100);
    }

    @Override
    public String toString() {
        return "RoomC{" +
                "muc luc:" + mucLuc + '\'' +
                "gia: " + gia +
                "}";
    }
}
