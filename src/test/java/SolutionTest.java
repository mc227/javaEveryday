import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
/*
Testing Mark Bubble Sort
* */
class SolutionTest {
    @Test
    void first() {
        int[] array = {10, 9, 8, 7};
        int[] result = {7,8,9,10};
        Solution solution =  new Solution();
        assertEquals(Arrays.toString(solution.markBubbleSort(array)),Arrays.toString(result));
    }
}