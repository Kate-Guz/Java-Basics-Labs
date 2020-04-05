public class MainHouse {
    public static void main(String[] args) {
        House array[] = House.createArray(2);
        House.showArray(array);
        House.findRoomsByNumber(array);
        House.findRoomsByNumberAndFloor(array);
        House.findRoomsBySquare(array);
    }
}
