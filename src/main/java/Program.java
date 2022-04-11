import java.lang.reflect.Array;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        // my test case
        int[] intArray = new int[] {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(twoNumberSum(intArray,7)));

        /*Test Case 1*/

    }
    // this is the algoexpert's solution to Two Number Sum
    // O(n^2) time | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // loop through array once starting index 0
        for(int i = 0; i < array.length; i++) {
            int firstArray = array[i];
            // loop through again but this time start after
            for (int j = i + 1; j <  array.length; j++) {
                int secondArray = array[j];
                if (firstArray + secondArray == targetSum) {
                    return new int[] {firstArray, secondArray};
                }
            }
        }
        return new int[0];
    }
}
