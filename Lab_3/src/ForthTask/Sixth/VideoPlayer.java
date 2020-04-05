package ForthTask.Sixth;

public class VideoPlayer extends Player implements Technic {
    public String quality;
    public VideoPlayer() {
        super();
    }
    public VideoPlayer(int volume, String quality) {
        super(volume);
        this.quality = quality;
    }
    public void show() {
        System.out.println("Volume: " + volume + ", quality: " + quality);
    }

}