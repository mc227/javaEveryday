import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        Solution solution = new Solution();
//        System.out.println(solution.partition(numbers,0,10));
        solution.sort(numbers,0,10);
        System.out.println(Arrays.toString(numbers));

    }

    public void sort(int[] numbers, int start, int end) {
        if(start < end) {
            int p = partition(numbers,start,end);
            sort(numbers,start,p - 1);
            sort(numbers,p+1,end);
        }
    }


    public int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int x = start - 1;
        for(int i = start; i < end; i++) {
            if(numbers[i] < pivot) {
                x++;
                swap(numbers, i, x);
            }
        }
        swap(numbers,x+1, end);
        return x+1;
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

}
