
import java.util.Scanner;

public class UserInterface {
    
    private Scanner scanner;
    private TodoList todo;
    
    public UserInterface(TodoList list, Scanner input) {
        this.todo = list;
        this.scanner = input;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command:");
            String cmd = this.scanner.nextLine();
            
            if (cmd.equals("stop")) {
                break;
            } else if (cmd.equals("add")) {
                this.newTask();
            } else if (cmd.equals("list")) {
                this.listTasks();
            } else if (cmd.equals("remove")) {
                this.removeTask();
            }
        }
    }
    
    public void newTask() {
        System.out.println("To add:");
        String newTask = this.scanner.nextLine();
        this.todo.add(newTask);
    }
    
    public void listTasks() {
        this.todo.print();
    }
    
    public void removeTask() {
        System.out.println("Which one is removed?");
        int index = this.scanner.nextInt();
        this.todo.remove(index);
    }
}