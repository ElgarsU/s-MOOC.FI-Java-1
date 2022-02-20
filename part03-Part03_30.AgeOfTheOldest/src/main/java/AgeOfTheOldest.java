
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        while (true) {
            String csv = scanner.nextLine();
            if (csv.equals("")) {
                break;
            }
            String[] splitCsv = csv.split(",");
            int age = Integer.valueOf(splitCsv[1]);
            oldestAge = (age > oldestAge) ? age : oldestAge;
        }
        System.out.println("Age of the oldest: "+oldestAge);
    }
}
