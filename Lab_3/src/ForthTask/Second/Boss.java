package ForthTask.Second;

public class Boss extends Engineer {
    public String s;

    public Boss() {
    }

    public Boss(int clock, String s) {
        super(clock);
        this.s = s;
    }

    public void howMuchTimeInWork() {
        super.howMuchTimeInWork();
        System.out.print("and " + s);
    }

}