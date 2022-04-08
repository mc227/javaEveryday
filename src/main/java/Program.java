import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    // this is the algoexpert solution
    // O(n^2) time | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        for(int i = 0; i < array.length - 1; i++) {
            int firstNum = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int secondNum = array[j];
                if (firstNum + secondNum == targetSum) {
                    return new int[] {firstNum, secondNum};
                }
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoNumberSum(intArray,3)));
    }
}
