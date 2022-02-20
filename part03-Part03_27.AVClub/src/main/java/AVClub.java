
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            String text = scanner.nextLine();
            String[] split = text.split(" ");
            for (int j = 0; j < split.length; j++) {
                if (split[j].contains("av")) {
                    System.out.println(split[j]);
                }
            }
        }
    }
}
