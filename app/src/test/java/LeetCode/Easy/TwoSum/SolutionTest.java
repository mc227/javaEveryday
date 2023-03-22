package LeetCode.Easy.TwoSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void example1() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
    @Test
    void example2() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }

    @Test
    void example3() {
        int[] nums = {3, 3};
        int target = 6;
        int[] expected = {0, 1};
        int[] actual = solution.twoSum(nums, target);
        assertArrayEquals(expected, actual);
    }
}