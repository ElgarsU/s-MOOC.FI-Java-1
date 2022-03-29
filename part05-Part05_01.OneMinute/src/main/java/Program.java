
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        // You can test your program here
        
        Timer t = new Timer();
        int i = 0;
        while (i < 362958) {
            t.advance();
            i++;
        }  
        System.out.println(t);
    }
}
