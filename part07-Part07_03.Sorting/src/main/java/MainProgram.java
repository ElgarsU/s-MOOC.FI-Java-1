
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
//        System.out.println(smallest(array));
//        System.out.println(indexOfSmallest(array));
//        System.out.println(indexOfSmallestFrom(array, 2));
//        sort(array);
    }
    
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            smallest = (number < smallest) ? number : smallest;
        }
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 1; i <= array.length-1; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int index = startIndex;
        for (int i = startIndex+1; i <= table.length-1; i++) {
            if (smallest > table[i]) {
                smallest = table[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int number1 = array[index1];
        int number2 = array[index2];
        array[index2] = number1;
        array[index1] = number2;
    }
    
    public static void sort(int[] array) {
        
        for (int i = 0; i <= array.length-1; i++) {
            if (array[i] > array[indexOfSmallestFrom(array, i)]) {
                swap(array, i, indexOfSmallestFrom(array, i));
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
