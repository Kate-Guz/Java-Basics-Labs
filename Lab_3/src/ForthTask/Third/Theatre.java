package ForthTask.Third;

public class Theatre extends PublicBuilding {
    private String string;

    public Theatre() {
    }

    public Theatre(int people, String string) {
        super(people);
        this.string = string;
    }

    public void look() {
        System.out.println("Count of people: " + getPeople() + string);
    }
}