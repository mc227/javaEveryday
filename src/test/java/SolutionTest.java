import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void SelectionSortTest() {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        solution.sort(numbers);
        Assert.assertArrayEquals(
                new int[] {3, 5, 7, 9, 12, 14, 15, 16, 18, 21, 23}, numbers );
    }
}