import java.util.ArrayList;

public class Hold {
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maxW) {
        this.maximumWeight = maxW;
        this.suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalWeight = 0;
        for (Suitcase s : suitcases) {
            totalWeight += s.totalWeight();
        }
        if (totalWeight + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }

    }

    public String toString() {
        int totalWeight = 0;
        for (Suitcase s : this.suitcases) {
            totalWeight += s.totalWeight();
        }
        return this.suitcases.size() + " suitcases (" + totalWeight + " kg)";
    }

    public void printItems() {
        for (Suitcase s : this.suitcases) {
            s.printItems();
        }
    }
}
