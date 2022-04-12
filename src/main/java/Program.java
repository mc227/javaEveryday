import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
//        /*Test Case 1*/
//        int[] intArray = new int[] {3, 5, -4, 8, 11, 1, -1, 6};
//        System.out.println(Arrays.toString(twoNumberSum(intArray,10)));
        /*Test Case */
        int[] intArray = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(twoNumberSum(intArray,10)));

    }
    // this is the algoexpert's first solution to Two Number Sum
    // working on muscle memory
    // O(n^2)) time | O(1) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        //loop through the array
        //loop through it again
        // add the two arrays
        // if it's equal the target sum print the two arrays
        for(int i = 0; i < array.length; i++) {
            int firstItem = array[i];
            for(int j = i + 1; j < array.length; j++) {
                int secondItem = array[j];
                if(firstItem+secondItem == targetSum) {
                    return new int[] {firstItem, secondItem};
                }
            }
        }
        return new int[0];
    }
}
