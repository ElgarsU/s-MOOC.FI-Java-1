
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager jokes;
    private Scanner input;
    
    public UserInterface(JokeManager jokeManager, Scanner inputObject) {
        this.jokes = jokeManager;
        this.input = inputObject;
    }
    
    public void start() {
        
        while (true) {
            this.displayMenu();
            String menu = input.nextLine();
            if (menu.equals("x") || menu.equals("X")) {
                break;
            } else if (menu.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = input.nextLine();
                this.jokes.addJoke(joke);
            } else if (menu.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(this.jokes.drawJoke());
            } else if (menu.equals("3")) {
                System.out.println("Printing the jokes.");
                this.jokes.printJokes();
            }
        }
    }
    
    public void displayMenu() {
        System.out.println("Commands:");
        System.out.println("1 - add joke");
        System.out.println("2 - draw a joke");
        System.out.println("3 - list jokes");        
        System.out.println("X - stop");
    }
}