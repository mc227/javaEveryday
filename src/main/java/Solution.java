public class Solution {
    public static void main(String[] args) {
        /*
        Quicksort Partitioning
          Partitioning is the process by which we reorder
          our array so that elements with a value less
          than our pivot are moved to the left of the
          pivot and those with a larger value are
          moved to the right (see Figure 2.2).
          There are numerous manners in which we can do this.
          Here, we will describe an easy-to-understand scheme known as Lomuto Partitioning.
          To get a good perception on this partitioning scheme,
          it is best to simplify what the algorithm is doing in five simple steps, as follows:
            1. Pick the right most element of the array as the pivot.
            2. Start from the left and find the next element that is larger than the pivot.
            3. Swap this element with the next, which is smaller than pivot element.
            4. Repeat steps 2 and 3 until no more swapping is possible.
            5. Swap the first item which is larger than the pivot's value with the pivot itself.
            To perform efficient partitioning using the steps mentioned, we can make use of
            two pointers, one pointing to the first item larger than the pivot value and
            the other used to search for the value that is smaller than pivot value.
        */

        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        int largerThanPivot = 0;
        int smallerThanPivot = 0;
        int pivot = numbers[numbers.length-1];
        System.out.printf("pivot: %s, largerThanPivot: %s, smallerThanPivot: %s%n", pivot, largerThanPivot, smallerThanPivot);

    }
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
