
public class AdvancedAstrology {

    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        for (int i = 1; i < size+1; i++){
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        int branches = 1;
        for (int i = 1; i < height+1; i++){
            printSpaces(height - i);
            printStars(branches);
            branches += 2;
        }
        for (int j = 0; j < 2; j++) {
            printSpaces((branches-3)/2-1);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
