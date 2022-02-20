
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String text = scanner.nextLine();
            String[] splitText = text.split(" ");
            System.out.println(splitText[0]);
        }

    }
}
