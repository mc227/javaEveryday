import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        /*
        In the following code,
        these are the integer pointers named x and i, respectively.
        The algorithm starts by choosing the pivot as the last item on the input array.
        It then processes the array from left to right in a single pass using the variable i.
        If the element currently being processed at i is smaller than the pivot, x is incremented and swapped.
        Using this technique, variable x is either pointing to a value larger than the pivot or
        the value of x is the same as i, in which case swapping will not modify the array.
        Once the loop exits, we perform the final step of swapping the first item that is larger than the
        pivot's value with the pivot.
        */
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        Solution solution = new Solution();
        solution.swap(numbers, 1,2);
        System.out.println(Arrays.toString(numbers));
    }
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
