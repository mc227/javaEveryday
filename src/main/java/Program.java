import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        /*Test Case 1*/
        int[] intArray = new int[] {3, 5, -4, 8, 11, 1, -1, 6};
        System.out.println(Arrays.toString(twoNumberSum(intArray,10)));

    }
    // this is the algoexpert's second solution to Two Number Sum
    // O(n) time | O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // create a hash set to store stuff and to also check stuff
        Set<Integer> set = new HashSet<>();
        // loop through every item in the array
        for(int i = 0; i < array.length; i++) {
            // define potential match as the target sum minus the item in the array
            int potentialMatch = targetSum - array[i];
            // if the set contain the potential match which is the difference between the target sum and the array item
            // then return potential match and array in the loop
            // else put it into the hash map
            if (set.contains(potentialMatch)) {
                return new int[] {potentialMatch, array[i]};
            } else {
                set.add(array[i]);
            }
        }
        return new int[0];
    }
}
