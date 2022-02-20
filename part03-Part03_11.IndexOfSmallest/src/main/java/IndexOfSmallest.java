
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here a program that reads user input
        // until the user enters 9999
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = scanner.nextInt();
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        //find the smallest number in list
        int smallestNumber = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (smallestNumber > list.get(i)) {
                smallestNumber = list.get(i);
            }
        }
        //print index where smallest number is located (can be multiple locations)
        System.out.println("Smallest number: "+smallestNumber);
        for (int i = 0; i < list.size(); i++) {
            if (smallestNumber == list.get(i)) {
                System.out.println("Found at index: "+i);
            }
        }
    }
}
