
import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> giftPackage;
    
    public Package() {
        this.giftPackage = new ArrayList<>();
    }
    
    public void addGift(Gift gift) {
        giftPackage.add(gift);
    }
    
    public int totalWeight() {
        int mass = 0;
        for (Gift gift : giftPackage) {
            mass = mass + gift.getWeight();
        }
        return mass;
    }
}