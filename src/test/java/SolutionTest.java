import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void TestTrue() {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        assertEquals(solution.binarySearch(7,numbers,0,10),true);
    }

    @Test
    void TestFalse() {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        assertEquals(solution.binarySearch(99,numbers,0,10),false);
    }
}