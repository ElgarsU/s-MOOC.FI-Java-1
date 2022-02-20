
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldestAge = 0;
        String oldestName = "";
        while (true) {
            String csv = scanner.nextLine();
            if (csv.equals("")) {
                break;
            }
            String[] splitCsv = csv.split(",");
            int age = Integer.valueOf(splitCsv[1]);
            if (age > oldestAge) {
                oldestAge = age;
                oldestName = splitCsv[0];
            }
        }
        System.out.println("Name of the oldest: "+oldestName);

    }
}
