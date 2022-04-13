import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        int[] intArray = new int[] {3,5,-4,8,11,1,-1,6};
        System.out.println(Arrays.toString(twoNumberSum(intArray,8)));
    }
    /**Solution 2
     * O(n)T | O(2)S
     * */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // create a hashset of Integers
        // just use one for loop
        // compare each number to a complement of the targetSum
        // meaning targetSum - the number array[i]
        Set<Integer> set = new HashSet<>();
        for(int num:array) {
            int potentialMatch = targetSum - num;
            if(set.contains(potentialMatch)){
                return new int[] {potentialMatch, num};
            } else {
                set.add(num);
            }
        }
        return new int[0];
    }
}
