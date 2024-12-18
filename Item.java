public class Item {

    private String name;
    private int weight;

    public Item(String n, int w) {
        this.name = n;
        this.weight = w;
    }

    public String getName() {
        return this.name;
    }

    public int getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }

}
