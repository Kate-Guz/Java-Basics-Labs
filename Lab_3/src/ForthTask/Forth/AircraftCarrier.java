package ForthTask.Forth;

public class AircraftCarrier extends WarShip implements Ship {
    public int plane;

    public AircraftCarrier() {
        super();
    }

    public AircraftCarrier(int mast, int gun, int plane) {
        super(mast, gun);
        this.plane = plane;
    }

    public void arms() {
        System.out.println("count of mast: " + mast + ", count of gun: " + gun + ", count  of planes: " + plane);
    }

}