import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        int[] intArray = new int[] {3,5,-4,8,11,1,-1,6};
        System.out.println(Arrays.toString(twoNumberSum(intArray,8)));
    }
    /**Solution 1
     * O(n^2)T | O(1)S*/
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // loop through starting from the beginning of the array
        // then inside do another for loop but start with array[1]
        // set first after the first for loop and second after the next for loop starts
        // return the first and second pair that results in the targetSum
        // at the end of the two for loops return an empty array if nothing comes up
        for(int i = 0; i < array.length; i++) {
            int first = array[0];
            for(int j = i+1; j < array.length; j++) {
                int second = array[j];
                if(first + second == targetSum) {
                    return new int[] {first, second};
                }
            }
            return new int[0];
        }
        return new int[0];
    }
}
