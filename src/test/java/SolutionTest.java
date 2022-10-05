import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void swapFirstAndLast() {
        int[] numbers = new int[]{5, 3, 5, 1, 6, 8, 1, 9, 0, 1, 3, 12};
        solution.swap(numbers, 0, numbers.length-1);
        Assert.assertArrayEquals(new int[]{12, 3, 5, 1, 6, 8, 1, 9, 0, 1, 3, 5},numbers);
    }
}