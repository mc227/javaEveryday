import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{7,15,14,5,9,18,3,21,23,16,12};
        // 7,15,14,5,9,18,3,21,23,16,12
        System.out.println(solution.partition(numbers,0,10));
        System.out.println(Arrays.toString(numbers));

    }
    public int partition(int[] array, int start,int end) {
        return 0;
    }
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
