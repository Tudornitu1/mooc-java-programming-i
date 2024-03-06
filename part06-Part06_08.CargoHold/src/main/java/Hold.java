import java.util.ArrayList;

public class Hold {
    private int max;
    private ArrayList<Suitcase> hold;
    private int weight = 0;

    public Hold(int max) {
        this.max = max;
        this.hold = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (weight + suitcase.totalWeight() <= max) {
            hold.add(suitcase);
            weight += suitcase.totalWeight();
        }
    }

    public String toString() {
        return hold.size() + " suitcases (" + weight + " kg)";
    }

    public void printItems() {
        for(Suitcase x:hold){
        x.printItems();
        }
    }
}
