package ForthTask.Seventh;

public class Tram extends PublicTransport implements TransportVehicle {
    public int speed;


    public Tram(int people, String place, int speed) {
        super(people, place);
        this.speed = speed;
    }

    public void characteristicsOfTransport() {
        System.out.println("number of seats to " + people + ", places: " + place + ", speed: " + speed);
    }

}