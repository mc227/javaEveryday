

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();


    }
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
