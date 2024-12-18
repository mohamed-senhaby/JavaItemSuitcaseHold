import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> suitcase;
    private int maximumWeight;

    public Suitcase(int maxW) {
        this.maximumWeight = maxW;
        this.suitcase = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maximumWeight) {
            this.suitcase.add(item);
        }
    }

    public void printItems() {
        for (Item item : this.suitcase) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.suitcase) {
            totalWeight += item.getWeight();
        }

        return totalWeight;
    }

    public Item heaviestItem() {

        if (this.suitcase.isEmpty()) {
            return null;
        }

        Item largestItem = this.suitcase.get(0);

        for (Item item : this.suitcase) {
            if (largestItem.getWeight() < item.getWeight()) {
                largestItem = item;
            }
        }

        return largestItem;

    }

    public String toString() {
        int totalWeight = 0;

        if (this.suitcase.isEmpty()) {
            return "no items (" + totalWeight + " kg)";
        }

        for (Item item : this.suitcase) {
            totalWeight += item.getWeight();
        }
        return this.suitcase.size() + " item (" + totalWeight + " kg)";
    }

}
