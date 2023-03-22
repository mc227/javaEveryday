package LeetCode.Easy.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * The time complexity of this TwoSum Java solution is O(n^2), where n is the length of the nums array. This is
 * because the solution uses a nested loop structure to compare each pair of elements in the nums array, which takes
 * O(n^2) time in the worst case.
 *
 * The space complexity of this solution is also O(n^2), since in the worst case, every element in the nums array is
 * part of a valid pair that sums to the target, and therefore every element will be added to the result ArrayList.
 * Therefore, the ArrayList could potentially store up to n(n-1)/2 elements, which is O(n^2) space complexity.
 *
 * Note that the final mapToInt() and toArray() methods take O(n) time and space complexity, respectively, but this
 * is insignificant compared to the O(n^2) time and space complexity of the nested loops and ArrayList operations.
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j <  nums.length; j++) {
                if(i!=j && i < j) {
                    if(nums[i]+nums[j]==target){
                        result.add(i);
                        result.add(j);
                    }
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
