package ForthTask.Second;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Engineer(8);
        Worker worker_2 = new Boss(6, "comment about work");
        worker.howMuchTimeInWork();
        worker_2.howMuchTimeInWork();
    }
}