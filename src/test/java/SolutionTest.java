import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest{
    Solution solution = new Solution();

    @Test
    void testEvenElements() {
        int[] numbers = new int[]{5,3,5,1,6,8,1,9,0,1,3,12};
        solution.mergeSort(numbers);
        assertArrayEquals(new int[]{0,1,1,1,3,3,5,5,6,8,9,12}, numbers);
    }
}
