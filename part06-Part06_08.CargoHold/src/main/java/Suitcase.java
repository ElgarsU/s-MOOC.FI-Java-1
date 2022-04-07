
import java.util.ArrayList;

public class Suitcase {
    
    private int maxWeight;
    private ArrayList<Item> contents;
    
    public Suitcase(int maxWeight) {
        this.contents = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= this.maxWeight) {
            contents.add(item);
        }
    }
    
    public String toString() {
        if (this.contents.size() ==0 ) {
            return "no items (0 kg)";
        } else {
            return this.contents.size()+ " " +((this.contents.size() == 1) ? "item" : "items")+ " (" +this.totalWeight()+ " kg)"; 
        }    
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : contents) {
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }
    
    public void printItems() {
        for (Item item : contents) {
            System.out.println(item.getName()+ " (" +item.getWeight()+ " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (this.contents.isEmpty()) {
            return null;
        } else {
            Item heaviest = contents.get(0);
            for (Item item : contents) {
                heaviest = (item.getWeight() > heaviest.getWeight()) ? item : heaviest;
            }    
            return heaviest;
        }
    }
}