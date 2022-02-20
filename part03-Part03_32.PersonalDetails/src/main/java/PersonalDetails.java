
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String longestName = "";
        int yearSum = 0;
        double counter = 0;
        while (true) {
            String csv = scanner.nextLine();
            if (csv.equals("")) break;
            String[] splitCSV = csv.split(",");
            int age = Integer.valueOf(splitCSV[1]);
            longestName = (longestName.length() < splitCSV[0].length()) ? splitCSV[0] : longestName;
            yearSum += age;
            counter++;
        }
        System.out.println("Longest name: "+longestName);
        System.out.println("Average of the birth years: "+(yearSum/counter));
    }
}
