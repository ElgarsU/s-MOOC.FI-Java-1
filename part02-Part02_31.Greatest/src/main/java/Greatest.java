
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        int greatest;
        greatest = (number1 > number2) ? number1 : number2;
        greatest = (number3 > greatest) ? number3 : greatest;
        return greatest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
