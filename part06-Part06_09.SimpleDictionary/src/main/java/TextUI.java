
import java.util.Scanner;

public class TextUI {
    
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner input, SimpleDictionary dictionary) {
        this.scanner = input;
        this.dictionary = dictionary;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {                
                break;
            } else if (command.equals("add")) {
                this.addWord(); 
            } else if (command.equals("search")) {
                this.searchWord();
            } else {
                System.out.println("Unknown command");
            }    
        }
        System.out.println("Bye bye!");
    }
    
    public void addWord() {
        System.out.println("Word:");
        String word = this.scanner.nextLine();
        System.out.println("Translation:");
        String translation = this.scanner.nextLine();
        this.dictionary.add(word, translation);
    }
    
    public void searchWord() {
        System.out.println("To be translated:");
        String word = this.scanner.nextLine();
        if (this.dictionary.translate(word) == null) {
            System.out.println("Word " +word+ " was not found");
        } else {
            System.out.println("Translation:");
            System.out.println(this.dictionary.translate(word));
        }    
    }
}