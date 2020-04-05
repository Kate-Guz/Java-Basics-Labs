package ForthTask.Second;

public class Engineer implements Worker {
    public int clock;

    public Engineer() {
    }

    public Engineer(int clock) {
        this.clock = clock;
    }

    public void howMuchTimeInWork() {
        System.out.println("work " + clock + " clocks a  day");
    }
}