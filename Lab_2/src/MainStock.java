public class MainStock {
    public static void main(String[] args) {
        Stock vegetables = new Stock(200, 600);
        Stock fruits = new Stock(450, 900);
        System.out.println("Stock items: ");
        System.out.print("Vegetables: ");
        vegetables.show();
        System.out.print("Fruits: ");
        fruits.show();
        System.out.println(" ");
        System.out.println("Change count and price: ");
        System.out.print("Vegetables: ");
        vegetables.setCount(500);
        vegetables.setPrice(3000);
        vegetables.show();
        System.out.println(" ");
        System.out.print("Fruits: ");
        fruits.setCount(1000);
        fruits.setPrice(5000);
        fruits.show();
        System.out.println(" ");
        System.out.println("Find new getCost: ");
        vegetables.getCost();
        fruits.getCost();
        System.out.println(" ");
        System.out.println("Comparing costs of items: ");
        Stock.compareCost(vegetables, fruits);
        System.out.println(" ");
        int count = fruits.getCountItems() + vegetables.getCountItems();
        System.out.println("Count all items = " + count);
    }
}