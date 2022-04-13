import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
//        int[] intArray = new int[] {3,5,-4,8,11,1,-1,6};
        int[] intArray = new int[] {3,5,-4};
        System.out.println(Arrays.toString(twoNumberSum(intArray,8)));
    }
    /**Solution 3
     * O(log(n))T | O(1)S
     * */
    public static int[] twoNumberSum(int[] array, int targetSum) {
        // assign leftmost index to left
        // assign leftmost index to right
        // while left < right
        // see if the sum of array[left] and array[right] is equal to the targetSum
        // if the sum is less than the target sum left++
        // else right--
        Arrays.sort(array);
        int left = 0;
        int right = array.length - 1;
        while(left < right) {
            if(array[left]+array[right]==targetSum){
                return new int[] {array[left], array[right]};
            } else if (array[left]+array[right] < targetSum) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }
}
