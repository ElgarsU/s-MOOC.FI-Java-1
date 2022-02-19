
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int endNumber = scanner.nextInt();
        System.out.println("Where from?");
        int startNumber = scanner.nextInt();
        for (int i = startNumber; i <= endNumber; i++) {
            if (startNumber > endNumber) {
                break;
            }
            System.out.println(i);
        }
    }
}
