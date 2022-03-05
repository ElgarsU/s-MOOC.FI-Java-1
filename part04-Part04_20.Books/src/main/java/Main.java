import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Title: ");
            String title = input.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(input.nextLine());
            System.out.println("Year: ");
            int year = Integer.valueOf(input.nextLine());
            
            books.add(new Book(title, pages, year));
        }
        
        System.out.println("What information will be printed?");
        String output = input.nextLine();
        
        if (output.equals("everything")) {
            for (Book book : books) {
                System.out.println(book.toString());
            }
        }
        if (output.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getName());
            }
        }

    }
}
