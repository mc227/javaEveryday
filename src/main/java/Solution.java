

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        Solution solution = new Solution();

    }
    /*
    binarySearch(x, array, start, end)
    if(start < end)
        mid = (end - start)/2 + start
        if (array[mid] == x) return true
        if (array[mid] > x) return binarySearch(x, array, start, mid - 1)
        return binarySearch(x, array, mid + 1, end)
    return false

    * */

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

}
