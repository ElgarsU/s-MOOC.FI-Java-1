
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String text = scanner.nextLine();
            String[] splitText = text.split(" ");
            System.out.println(splitText[splitText.length-1]);
        }

    }
}
