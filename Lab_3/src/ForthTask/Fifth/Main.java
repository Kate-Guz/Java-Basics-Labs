package ForthTask.Fifth;

public class Main {
    public static void main(String[] args) {
        Carrier ship = new Carrier(1, Carrier.createArrayOfWeight());
        Tanker ship1 = new Tanker(2, Carrier.createArrayOfWeight(), 200);
        Carrier m;
        m = ship;
        m.weight();
        m = ship1;
        m.weight();
    }
}
