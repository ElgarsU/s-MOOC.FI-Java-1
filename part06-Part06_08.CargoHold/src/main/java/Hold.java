
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> luggage;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.totalWeight = 0;
        this.luggage = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight + suitcase.totalWeight() <= this.maxWeight) {
            luggage.add(suitcase);
            this.totalWeight = this.totalWeight + suitcase.totalWeight();
        }
    }
    
    public String toString() {
        if (this.luggage.isEmpty()) {
            return "no suitcases (0 kg)";
        } else {
            return this.luggage.size()+ " suitcases (" +this.totalWeight+ " kg)";
        } 
    }
    
    public void printItems() {
        if (this.luggage.isEmpty()) {
            System.out.println("Empty");
        } else {
            for (Suitcase suitcase : luggage) {
                suitcase.printItems();
            }
        }
    }
}