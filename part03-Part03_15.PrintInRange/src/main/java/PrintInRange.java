
import java.util.ArrayList;

public class PrintInRange {

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        System.out.println("The numbers in the range ["+lowerLimit+", "+upperLimit+"]");
        for (int element : numbers) {
            if (element > lowerLimit && element < upperLimit) {
                System.out.println(element);
            }
        }
    }
    public static void main(String[] args) {
        // Try your method here
    }
    
}
