package ForthTask.Third;

public abstract class PublicBuilding implements Building {
    private int people;

    public PublicBuilding() {
    }

    public PublicBuilding(int people) {

        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public abstract void look();
}