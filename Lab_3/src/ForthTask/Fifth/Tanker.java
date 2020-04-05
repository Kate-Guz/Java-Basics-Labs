package ForthTask.Fifth;

public class Tanker extends Carrier implements Ship {
    private double oil;

    public Tanker(int number, int[] weight, double oil) {
        super(number, weight);
        this.oil = oil;
    }

    @Override
    public void weight() {
        Tanker ob = new Tanker(2, Carrier.createArrayOfWeight(), 200);
        System.out.println("Number of weight: " + getNumber() + "; " + ob.toString() + "; number of oil: " + oil);
    }

}