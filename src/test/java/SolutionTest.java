import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
/*
Testing Mark Bubble Sort
* */
class SolutionTest {
    @Test
    void firstMarkBubbleSort() {
        int[] array = {3,5,6,2,7};
        int[] result = {2,3,5,6,7};
        Solution solution =  new Solution();
        assertEquals(Arrays.toString(solution.markBubbleSort(array)),
                Arrays.toString(result));
    }
}