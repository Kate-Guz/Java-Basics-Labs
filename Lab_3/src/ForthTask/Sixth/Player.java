package ForthTask.Sixth;

public abstract class Player implements Technic {
    public int volume;
    public Player() {}
    public Player(int volume) {
        this.volume = volume;
    }
    public abstract void show();
}