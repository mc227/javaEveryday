import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        int[] intArray = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(twoNumberSum(intArray,17)));

    }
    // this is the algoexpert's second solution to Two Number Sum
    // working on muscle memory
    // O(n) time | O(n) space
    public static int[] twoNumberSum(int[] array, int targetSum) {
        Set<Integer> set = new HashSet<>();
        for(int num:array){
            int potentialMatch = targetSum - num;
            if (set.contains(potentialMatch)) {
                return new int[] {potentialMatch, num};
            } else {
                set.add(num);
            }
        }
        return new int[0];
    }
}
