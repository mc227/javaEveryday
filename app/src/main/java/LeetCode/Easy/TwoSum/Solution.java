package LeetCode.Easy.TwoSum;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * i took a quick peek on the solution one
 * with time complexity of O(n^2)
 * and space complexity of O(1)
 */

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j <  nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
}
