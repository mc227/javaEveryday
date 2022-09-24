import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarkBubbleSortTest {
    @Test
    void fooTest() {
        MarkBubbleSort markBubbleSort = new MarkBubbleSort();
        int[] array = {66, 24, 75, 22, 12, 87};
        int[] sortedArray = {12,22,24,66,75,87};
        assertEquals(Arrays.toString(markBubbleSort.bubbleSort(array)),Arrays.toString(sortedArray));
    }
}