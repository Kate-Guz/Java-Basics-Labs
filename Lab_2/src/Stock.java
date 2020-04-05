public class Stock {

    private int countItems;
    private int price;

    public Stock() {

    }

    public Stock(int countItems, int price) {

        this.countItems = countItems;
        this.price = price;
    }

    public void setCount(int changeCount) {
        this.countItems = changeCount;
    }

    public void setPrice(int changedPrice) {
        this.price = changedPrice;
    }

    public int getCost() {
        int cost;
        cost = getCountItems() / getPrice();

        return cost;
    }

    public static void compareCost(Stock firstItem, Stock secondItem) {

        int firstCost = firstItem.getCost();
        int secondCost = secondItem.getCost();

        if (firstCost > secondCost) {
            System.out.print("First item costs more than second");
        }
        if (firstCost < secondCost) {
            System.out.print("First item costs less than second");
        }
        if (firstCost == secondCost) {
            System.out.print("Costs of two items is equal.");
        }
    }

    public int getCountItems() {
        return countItems;
    }

    public int getPrice() {
        return price;
    }

    public void show() {
        System.out.println("Count = " + countItems + " Price = " + price);
    }

}

