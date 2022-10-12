import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest{
    Solution solution = new Solution();

    @Test
    public void testEvenElements() {
//        int[] numbers = new int[]{5,3,5,1,6,8,1,9,0,1,3,12};
        int[] numbers = new int[]{0,1,1,1,3,3,5,5,6,8,9,12};
//        solution.selectionSort(numbers);
//        solution.binarySearch(7,numbers);
        assertEquals(solution.binarySearch(7,numbers), false);
    }
    @Test
    public void testOddsElements() {
//        int[] numbers = new int[]{5,3,5,1,6,8,1,9,0,1,16,3,12};
        int[] numbers = new int[]{0,1,1,1,3,3,5,5,6,8,9,12,16};
//        solution.selectionSort(numbers);
//        assertArrayEquals(new int[]{0,1,1,1,3,3,5,5,6,8,9,12,16}, numbers);
        assertEquals(solution.binarySearch(16,numbers), true);
    }
    //
    @Test
    public void testAlreadySorted() {
//        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//        solution.selectionSort(numbers);
//        assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, numbers);
        assertEquals(solution.binarySearch(16,numbers), false);
    }

    @Test
    public void testSameNumber() {
        int[] numbers = new int[]{3,3,3,3,3};
//        solution.selectionSort(numbers);
//        assertArrayEquals(new int[]{3,3,3,3,3}, numbers);
        assertEquals(solution.binarySearch(16,numbers), false);
    }

    @Test
    public void testEmpty() {
        int[] numbers = new int[]{};
//        solution.selectionSort(numbers);
//        assertArrayEquals(new int[]{}, numbers);
        assertEquals(solution.binarySearch(16,numbers), false);
    }

    @Test
    public void testOneElement() {
        int[] numbers = new int[]{8};
//        solution.selectionSort(numbers);
//        assertArrayEquals(new int[]{8}, numbers);
    }

}
