import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = new int[]{7, 15, 14, 5, 9, 18, 3, 21, 23, 16, 12};
        Solution solution = new Solution();
        solution.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    /*
    selectionSort(array)
    n = length(array)
    for(i = 0 to n - 1)
        pointer = i
        for(j = i  to n - 1)
            if(array[pointer] > array[j])
                pointer = j
        swap(array,i,pointer)

    * */
    public void sort(int[] array) {
        for(int i = 0; i < array.length; i++){
            int minPtr = i;
            for(int j = i; j < array.length; j++){
                if(array[minPtr] > array[j]){
                    minPtr = j;
                }
            }
            swap(array, minPtr, i);
        }
    }

    private void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

}
