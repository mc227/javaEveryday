import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{7,15,14,5,9,18,3,21,23,16,12};
        // 7,15,14,5,9,18,3,21,23,16,12
//        int[] numbers = new int[]{5,3,5,1,6,8,1,9,0,1,3,12};
        System.out.println(solution.partition(numbers,0,10));
//        System.out.println(solution.partition(numbers,0,11));
        System.out.println(Arrays.toString(numbers));

    }
    public int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int x = start - 1;
        for(int i = start; i < end; i++) {
            if(pivot > array[i]){
                x++;
                swap(array,x,i);
            }
        }
        swap(array,end,x+1);
        return x+1;
    }
    public void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }

}
