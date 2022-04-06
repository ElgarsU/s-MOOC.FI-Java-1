
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (this.elements.isEmpty()) {
            return "The collection " +this.name+ " is empty.";
        } else {
            int lenght = elements.size();
            String letters = "";
            if (lenght == 1) {
                for (String letter : elements) {
                    letters = letters + letter;
                }
            } else {
                for (String letter : elements) {
                    letters = letters + letter + "\n";
                }
            }    
            return "The collection " +this.name+ " has " +lenght+ " " +((lenght>1) ? "elements:" : "element:")+ "\n" +letters;
        }
    }
    
}
